package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ici extends fdbr implements fdat {
    final /* synthetic */ hml a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ici(hml hmlVar) {
        super(2);
        this.a = hmlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ics icsVar = (ics) obj;
        ics icsVarA = (icq) obj2;
        if (icsVarA instanceof icg) {
            fdau fdauVar = ((icg) icsVarA).a;
            fdcm.e(fdauVar, 3);
            hml hmlVar = this.a;
            icsVarA = icj.a(hmlVar, (ics) fdauVar.a(ics.e, hmlVar, 0));
        }
        return icsVar.a(icsVarA);
    }
}
