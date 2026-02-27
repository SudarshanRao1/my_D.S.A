#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct node {
    char data[20];
    struct node* next;
};


void traverse(struct node* head){
    struct node* temp=head;
    while(temp!=NULL){
        printf("%s\t",temp->data);
        temp=temp->next;
    }
}

struct node* insertStart(struct node *head,char newdata[20]){
    struct node *temp=head;
    struct node *newnode = malloc(sizeof(struct node));
    strcpy(newnode->data,newdata);
    newnode->next=temp;
    head=newnode;

    return head;
}


void insertMid(struct node* head,char newdata[20],char after[20]){
    struct node*temp=head;
    while(temp!=NULL && strcmp(temp->data,after)!=0){
        temp=temp->next;
    }
    struct node* newnode=(struct node*)malloc(sizeof(struct node));
    strcpy(newnode->data,newdata);
    newnode->next=temp->next;
    temp->next=newnode;
}

void insertEnd(struct node* head,char newdata[20]){
    struct node*temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    struct node*newnode=malloc(sizeof(struct node));
    strcpy(newnode->data,newdata);
    temp->next=newnode;
    newnode->next=NULL;
}


void deleteMid(struct node*head,char delete[20]){
    struct node*temp=head;
    while(temp!=NULL && strcmp(temp->next->data,delete)!=0){
        temp=temp->next;
    }
    struct node*temp2=temp->next;
    temp->next=temp2->next;
    free(temp2);
}


int main(){
    struct node* head = malloc(sizeof(struct node));
    struct node* first=malloc(sizeof(struct node));
    struct node* second=malloc(sizeof(struct node));
    
    scanf("%s",&head->data);
    scanf("%s",&first->data);
    scanf("%s",&second->data);

    head->next=first;
    first->next=second;

    traverse(head);
    char newname[20],after[20];

    scanf("%s",&newname);
    head=insertStart(head,newname);
    traverse(head);
    
    scanf("%s",&after);
    scanf("%s",&newname);
    insertMid(head,newname,after);
    traverse(head);
    
    scanf("%s",&newname);
    insertEnd(head,newname);
    traverse(head);
    
    scanf("%s",&newname);
    deleteMid(head,newname);
    traverse(head);


    return 0;
}

