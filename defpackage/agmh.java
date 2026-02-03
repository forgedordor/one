package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agmh extends fcyz implements fdat {
    final /* synthetic */ brdp a;
    final /* synthetic */ agmk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agmh(fcxy fcxyVar, brdp brdpVar, agmk agmkVar) {
        super(2, fcxyVar);
        this.a = brdpVar;
        this.b = agmkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agmh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        fctl.b(obj);
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("shouldFilter");
        bsboVarE.h(new agmj(this.a));
        dqqj dqqjVarP = bsboVarE.b().p();
        try {
            brzj brzjVar = (brzj) dqqjVarP;
            try {
                if (brzjVar.getCount() == 0) {
                    fczl.a(brzjVar, null);
                    z = true;
                } else {
                    brzjVar.moveToFirst();
                    boolean zIsEmpty = TextUtils.isEmpty(((ParticipantsTable.BindData) brzjVar.cQ()).S());
                    fczl.a(brzjVar, null);
                    z = zIsEmpty;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                fczl.a(dqqjVarP, null);
                return boolValueOf;
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        agmh agmhVar = new agmh(fcxyVar, this.a, this.b);
        agmhVar.c = obj;
        return agmhVar;
    }
}
