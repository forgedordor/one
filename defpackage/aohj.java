package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aohj extends fcyz implements fdat {
    final /* synthetic */ axcm a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aohj(fcxy fcxyVar, axcm axcmVar) {
        super(2, fcxyVar);
        this.a = axcmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aohj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        axcm axcmVar = this.a;
        btzd btzdVarA = ((aogm) ProfilesTable.d("SelfProfileRowFactory#getOrCreateSelfProfileRow", new dqsh(new aohl(axcmVar)), new dqsf(aohm.a), new dqsg(new aohn(axcmVar)))).a();
        btzdVarA.getClass();
        return btzdVarA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aohj aohjVar = new aohj(fcxyVar, this.a);
        aohjVar.b = obj;
        return aohjVar;
    }
}
