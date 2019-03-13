#ifndef __EXPRESSION_TREE_H__
#define __EXPRESSION_TREE_H__

#include "BinaryTree2.h"

BTreeNode * MakeExpTree(char exp[]);
int EvaluateExpTree(BTreeNode * bt);

void ShowPrefixTypeExp(BTreeNode * bt);
void ShowInfixTypeExp(BTreeNode * bt);
void ShoePostfixTypeExp(BTreeNode * bt);

#endif~