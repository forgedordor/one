package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chjv extends fcyz implements fdat {
    private /* synthetic */ Object a;

    public chjv(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chjv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bsun bsunVarA = ProfilesTable.a();
        bsunVarA.A("getPeopleProfileConsumerStateV2");
        bsunVarA.e(chjx.a);
        bsunVarA.c(chjy.a);
        bsunVarA.s();
        int iH = bsunVarA.b().h();
        elqu elquVar = (elqu) elqv.a.createBuilder();
        elquVar.getClass();
        elquVar.copyOnWrite();
        elqv elqvVar = (elqv) elquVar.instance;
        elqvVar.b |= 1;
        elqvVar.c = iH;
        elquVar.copyOnWrite();
        elqv elqvVar2 = (elqv) elquVar.instance;
        elqvVar2.b |= 2;
        elqvVar2.d = 2;
        evsn evsnVarBuild = elquVar.build();
        evsnVarBuild.getClass();
        return (elqv) evsnVarBuild;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chjv chjvVar = new chjv(fcxyVar);
        chjvVar.a = obj;
        return chjvVar;
    }
}
