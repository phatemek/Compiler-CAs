.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public static calcPow(II)I
		.limit stack 128
		.limit locals 128
		ldc 1
		
		istore 2
		
		ldc 0
		
		istore 3
		
		Label_1:
		iload 3
		
		iload 1
		
		if_icmpeq Label_5
		ldc 0
		goto Label_6
		Label_5:
		ldc 1
		Label_6:
		ifeq Label_3
		Label_2:
		goto Label_0
		
		goto Label_4
		Label_3:
		Label_4:
		
		iload 2
		
		iload 0
		
		imul
		
		istore 2
		
		iload 3
		
		ldc 1
		iadd
		istore 3
		
		goto Label_1
		Label_0:
		
		iload 2
		
		ireturn
		
		.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc 3
		
		ldc 5
		
		invokestatic Main/calcPow(II)I
		
		invokevirtual java/io/PrintStream/println(I)V
		return
		.end method
