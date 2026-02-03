package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kew {
    public static final hyr a = new hyu(new fdat() { // from class: keu
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            hya hyaVar = (hya) obj;
            kew kewVar = (kew) obj2;
            return fcva.f(jxp.a(kewVar.b, jxp.a, hyaVar), jxp.a(new jyo(kewVar.c), jxp.p, hyaVar));
        }
    }, new fdap() { // from class: kev
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            jyo jyoVar = null;
            juo juoVar = (fdbq.f(obj2, false) || obj2 == null) ? null : (juo) jxp.a.a(obj2);
            juoVar.getClass();
            Object obj3 = list.get(1);
            long j = jyo.a;
            hyr hyrVar = jxp.p;
            if (!fdbq.f(obj3, false) && obj3 != null) {
                jyoVar = (jyo) hyrVar.a(obj3);
            }
            jyoVar.getClass();
            return new kew(juoVar, jyoVar.b);
        }
    });
    public final juo b;
    public final long c;
    public final jyo d;

    public kew(juo juoVar, long j, jyo jyoVar) {
        this.b = juoVar;
        this.c = jyp.b(j, a().length());
        this.d = jyoVar != null ? new jyo(jyp.b(jyoVar.b, a().length())) : null;
    }

    public static /* synthetic */ kew b(kew kewVar, juo juoVar, long j, int i) {
        if ((i & 1) != 0) {
            juoVar = kewVar.b;
        }
        if ((i & 2) != 0) {
            j = kewVar.c;
        }
        return new kew(juoVar, j, (i & 4) != 0 ? kewVar.d : null);
    }

    public static /* synthetic */ kew c(kew kewVar, String str) {
        return new kew(new juo(str), kewVar.c, kewVar.d);
    }

    public final String a() {
        return this.b.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kew)) {
            return false;
        }
        kew kewVar = (kew) obj;
        return jyo.h(this.c, kewVar.c) && fdbq.f(this.d, kewVar.d) && fdbq.f(this.b, kewVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        long j = jyo.a;
        jyo jyoVar = this.d;
        return ((iHashCode + jyn.a(this.c)) * 31) + (jyoVar != null ? jyn.a(jyoVar.b) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.b) + "', selection=" + ((Object) jyo.f(this.c)) + ", composition=" + this.d + ')';
    }

    public /* synthetic */ kew(juo juoVar, long j) {
        this(juoVar, j, (jyo) null);
    }

    public /* synthetic */ kew(String str, long j, int i) {
        this(new juo(1 == (i & 1) ? "" : str), (i & 2) != 0 ? jyo.a : j, (jyo) null);
    }
}
