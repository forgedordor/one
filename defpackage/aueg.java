package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aueg {
    public final aued a;

    public aueg(aued auedVar) {
        this.a = auedVar;
    }

    public final /* synthetic */ auee a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (auee) evsnVarBuild;
    }

    public final /* synthetic */ evwn b() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((auee) this.a.instance).c);
        listUnmodifiableList.getClass();
        return new evwn(listUnmodifiableList);
    }

    public final /* synthetic */ evwn c() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((auee) this.a.instance).b);
        listUnmodifiableList.getClass();
        return new evwn(listUnmodifiableList);
    }

    public final /* synthetic */ void d(evwn evwnVar, audc audcVar) {
        evwnVar.getClass();
        audcVar.getClass();
        this.a.b(audcVar);
    }
}
