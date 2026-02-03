package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbb {
    public final OutputStream a;
    public final baz b;

    public bbb(OutputStream outputStream, baz bazVar) {
        this.a = outputStream;
        this.b = bazVar;
    }

    public final String toString() {
        return "OutputFileOptions{mFile=null, mContentResolver=null, mSaveCollection=null, mContentValues=null, mOutputStream=" + this.a + ", mMetadata=" + this.b + "}";
    }
}
