package com.google.android.libraries.inputmethod.emoji.search;

import defpackage.drsp;
import defpackage.ekrg;
import defpackage.etpd;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class EmojiSearchJniImpl implements drsp {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/search/EmojiSearchJniImpl");
    public static volatile boolean b;
    public static volatile boolean c;
    public static List d;
    public static etpd e;

    public static native void nativeInit();

    public static native void nativeLoadData(String[] strArr);

    public static native byte[] nativeSearch(byte[] bArr);

    private static native void nativeUnloadData();
}
