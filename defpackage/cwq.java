package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwq extends fdbr implements fdat {
    final /* synthetic */ dar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwq(dar darVar) {
        super(2);
        this.a = darVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        cze czeVar = (cze) obj;
        cze czeVar2 = (cze) obj2;
        cze czeVar3 = cze.c;
        boolean z = false;
        if (czeVar == czeVar3 && czeVar2 == czeVar3 && !this.a.b().e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
