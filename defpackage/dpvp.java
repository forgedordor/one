package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvp {
    public final fdap a;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public Object c;
    private final fdap d;
    private final fdap e;

    public dpvp(fdap fdapVar, fdap fdapVar2, fdap fdapVar3) {
        this.d = fdapVar;
        this.e = fdapVar2;
        this.a = fdapVar3;
    }

    public final void a(dpvv dpvvVar) {
        dpvvVar.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = this.b;
        if (copyOnWriteArraySet.add(dpvvVar) && !copyOnWriteArraySet.isEmpty() && this.c == null) {
            Object objInvoke = this.d.invoke(new dpvo(this));
            this.e.invoke(objInvoke);
            this.c = objInvoke;
        }
    }
}
