package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aogv extends fcyz implements fdat {
    final /* synthetic */ aoha a;
    final /* synthetic */ ParticipantsTable.BindData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aogv(fcxy fcxyVar, aoha aohaVar, ParticipantsTable.BindData bindData) {
        super(2, fcxyVar);
        this.a = aohaVar;
        this.b = bindData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aogv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return anur.a(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aogv aogvVar = new aogv(fcxyVar, this.a, this.b);
        aogvVar.c = obj;
        return aogvVar;
    }
}
