package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bypk extends fcyz implements fdat {
    int a;
    final /* synthetic */ bypl b;
    final /* synthetic */ long c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bypk(fcxy fcxyVar, bypl byplVar, long j) {
        super(2, fcxyVar);
        this.b = byplVar;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bypk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        long jK;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bypl byplVar = this.b;
            long j = this.c;
            this.a = 1;
            obj = fdin.a(eicg.a(byplVar.f), new bypg(null, j), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        bmre bmreVar = (bmre) obj;
        bmsp bmspVarM = bmsp.a;
        if (bmreVar == null) {
            long j2 = this.c;
            bypl.a.p("No deleted message entry in buffer for message " + j2);
            jK = -1;
        } else {
            long j3 = this.c;
            bypl.a.p("Message deleted entry found for message " + j3 + ". Deletion reason = " + bmreVar.m());
            bypl byplVar2 = this.b;
            if (!((appg) byplVar2.d.b()).a()) {
                ((aukz) byplVar2.c.b()).p(Arrays.asList(new MessageIdType(j3)), bmreVar.k(), bmreVar.m());
                return fctx.a;
            }
            jK = bmreVar.k();
            bmspVarM = bmreVar.m();
            bmspVarM.getClass();
        }
        bypl byplVar3 = this.b;
        if (((appg) byplVar3.d.b()).a()) {
            ((aukz) byplVar3.c.b()).p(Arrays.asList(new MessageIdType(this.c)), jK, bmspVarM);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bypk bypkVar = new bypk(fcxyVar, this.b, this.c);
        bypkVar.d = obj;
        return bypkVar;
    }
}
