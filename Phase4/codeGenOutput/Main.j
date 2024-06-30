.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
		getstatic java/lang/System/out Ljava/io/PrintStream;
		iload 1
		
		ldc 30
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		
		idiv
		
		invokevirtual java/io/PrintStream/println(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		iload 1
		
		ldc 30
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		
		imul
		
		invokevirtual java/io/PrintStream/println(I)V
		iload 0
		ifeq Label_6
		Label_5:
		
		goto Label_7
		Label_6:
		
		Label_7:
		iload 0
		
		ldc 1
		ixor
		iload 1
		
		ldc 100
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		
		if_icmpgt Label_3
		ldc 0
		goto Label_4
		Label_3:
		ldc 1
		Label_4:
		ifeq Label_1
		Label_0:
		
		goto Label_2
		Label_1:
		Label_2:
.method public start(ZI)V
		.limit stack 128
		.limit locals 128
		return
		.end method
.method public itList()V
		.limit stack 128
		.limit locals 128
		return
		.end method
		return
		iload 1
		
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		
		if_icmpeq Label_15
		ldc 0
		goto Label_16
		Label_15:
		ldc 1
		Label_16:
		ifeq Label_13
		Label_12:
		
		goto Label_14
		Label_13:
		Label_14:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 0
		
		iload 1
		
		invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;
		
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
.method public printRecursive(Ljava/util/ArrayList;I)V
		.limit stack 128
		.limit locals 128
		return
		.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean
		
		ldc 300
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		
		invokestatic Main/start(ZI)V
		return
		.end method
