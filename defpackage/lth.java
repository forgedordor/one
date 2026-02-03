package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lth extends lti {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lth(List list) {
        super(list);
        list.getClass();
    }

    @Override // defpackage.lti
    public final /* bridge */ /* synthetic */ lti a(ltu ltuVar) {
        fcww fcwwVar = new fcww((byte[]) null);
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fcwwVar.add(((ltb) list.get(i)).j(ltuVar));
        }
        return new lth(fcva.a(fcwwVar));
    }

    public final String toString() {
        return "Edge";
    }
}
