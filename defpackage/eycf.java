package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eycf {
    public final int a;
    public final eyce b;
    public final InputStream c;

    public eycf(int i, eyce eyceVar, InputStream inputStream) {
        this.a = i;
        this.b = eyceVar;
        this.c = inputStream;
    }

    public final String a() {
        eyce eyceVar = this.b;
        String strA = eyceVar.a("X-GUploader-UploadID");
        String strValueOf = String.valueOf(eyceVar);
        String strConcat = strA == null ? "\n No upload id." : "\n Upload id: ".concat(strA);
        return "HttpResponse:\n   " + this.a + "  " + strValueOf + strConcat;
    }
}
