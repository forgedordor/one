package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltg extends lti {
    public final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltg(List list, boolean z) {
        super(list);
        list.getClass();
        this.a = z;
    }

    @Override // defpackage.lti
    public final lti a(ltu ltuVar) {
        fcww fcwwVar = new fcww((byte[]) null);
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fcwwVar.add(((ltb) list.get(i)).j(ltuVar));
        }
        return new ltg(fcva.a(fcwwVar), this.a);
    }

    public final String toString() {
        return "Corner: cubics=" + fcva.aF(this.b, ", ", null, null, new fdap() { // from class: ltf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ltb ltbVar = (ltb) obj;
                ltbVar.getClass();
                return "[" + ltbVar + ']';
            }
        }, 30) + " convex=" + this.a;
    }
}
