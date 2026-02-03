package defpackage;

import android.os.IBinder;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espp implements ejxr {
    private final fbsj a;
    private final fbuh b;
    private boolean c;

    public espp(fbsj fbsjVar, fbuh fbuhVar, lvj lvjVar) {
        this.a = fbsjVar;
        this.b = fbuhVar;
        fbul.a(lvjVar.P(), fbsjVar);
    }

    @Override // defpackage.ejxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized IBinder get() {
        if (this.c) {
        } else {
            try {
                this.c = true;
                this.a.d();
            } catch (IOException e) {
                ((ekrd) ((ekrd) ((ekrd) espq.a.i()).g(e)).h("com/google/frameworks/client/data/android/binder/IoGrpcInterop$ServerLifecycle", "get", 76, "IoGrpcInterop.java")).t("Unable to start server %s", this.a);
            }
        }
        return this.b.a;
    }
}
