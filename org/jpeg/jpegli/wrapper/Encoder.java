package org.jpeg.jpegli.wrapper;

import defpackage.fgqu;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class Encoder {
    public static final /* synthetic */ int a = 0;

    static {
        int i = fgqu.a;
    }

    public static native int nativeEncode(int i, int i2, int[] iArr, int[] iArr2, WritableByteChannel writableByteChannel);

    public static native int nativeInit();
}
