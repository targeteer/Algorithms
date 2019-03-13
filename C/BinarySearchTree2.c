#include <stdio.h>
#include <stdlib.h>
//미완성************************************************
//미완성************************************************
//미완성************************************************
//미완성************************************************
//미완성************************************************

#include "BinaryTree3.h"
#include "BinaryTree3.c"
#include "BinarySearchTree2.h"

BTreeNode BSTRemove(BTreeNode ** pRoot, BSTData target)
{
    BTreeNode * pVRoot = MakeBTreeNode();
    BTreeNode * pNode = pVRoot;
    BTreeNode * cNode = *pRoot;
    BTreeNode * dNode;

    ChangeRightSubTree(pVRoot, *pRoot);

    while(cNode != NULL && GetData(cNode) != target)
    {
        pNode = cNode;
        if(target < GetData(cNode))
            cNode = GetLeftSubTree(cNode);
        else
            cNode = GetRightSubTree(cNode);
    }

    if(cNode == NULL)
        return NULL;
    
    dNode = cNode;

    if(GetLeftSubTree(dNode) == NULL && GetRightSubTree(dNode) == NULL)
    {
        if(GetLeftSubTree(pNode) == dNode)
            RemoveLeftSubTree(pNode);
        else
            RemoveRightSubTree(pNode);
    }

    else if(GetLeftSubTree(dNode)==NULL || GetRightSubTree(dNode) == NULL)
    {
        BTreeNode * dcNode;

        if(GetLeftSubTree(dNode) != NULL)
            dcNode = GetLeftSubTree(dNode);
        else
            dcNode = GetRightSubTree(dNode);
        
        if(GetLeftSubTree(pNode) == dNode)
            ChangeLeftSubTree(pNode, dcNode);
        else
            ChangeRightSubTree(pNode, dcNode);
    }
}