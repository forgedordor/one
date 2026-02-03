package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aklv extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ aklw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aklv(aklw aklwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = aklwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aklv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        aklw aklwVar;
        fcww fcwwVar;
        fcww fcwwVar2;
        Object obj2;
        fcww fcwwVar3;
        ?? r1;
        fcyl fcylVar = fcyl.a;
        int i = this.e;
        if (i == 0) {
            fctl.b(obj);
            aklwVar = this.f;
            fcwwVar = new fcww((byte[]) null);
            cdew cdewVar = new cdew();
            cdewVar.b("conversation_id");
            cdewVar.c(((DefaultConversation) aklwVar.a).a.b());
            fcwwVar.add(cdewVar.a());
            this.a = aklwVar;
            this.b = fcwwVar;
            this.c = fcwwVar;
            this.d = fcwwVar;
            this.e = 1;
            obj = aklwVar.a(this);
            if (obj != fcylVar) {
                fcwwVar2 = fcwwVar;
                obj2 = fcwwVar2;
            }
            return fcylVar;
        }
        if (i != 1) {
            ?? r0 = this.b;
            List list = (List) this.a;
            fctl.b(obj);
            fcwwVar3 = r0;
            r1 = list;
            fcwwVar3.add(obj);
            return fcva.a(r1);
        }
        ?? r12 = this.d;
        ?? r2 = this.c;
        obj2 = this.b;
        aklwVar = (aklw) this.a;
        fctl.b(obj);
        fcwwVar2 = r12;
        fcwwVar = r2;
        fcwwVar2.add(obj);
        this.a = obj2;
        this.b = fcwwVar;
        this.c = null;
        this.d = null;
        this.e = 2;
        obj = aklwVar.f(this);
        if (obj != fcylVar) {
            fcwwVar3 = fcwwVar;
            r1 = obj2;
            fcwwVar3.add(obj);
            return fcva.a(r1);
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aklv(this.f, fcxyVar);
    }
}
