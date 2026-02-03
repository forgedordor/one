package defpackage;

import android.net.Uri;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awsi extends fcyz implements fdat {
    final /* synthetic */ List a;
    final /* synthetic */ awsk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awsi(fcxy fcxyVar, List list, awsk awskVar) {
        super(2, fcxyVar);
        this.a = list;
        this.b = awskVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awsi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        List list = this.a;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(awjg.a((awpx) it.next()));
        }
        awsb awsbVarA = awse.a();
        awsbVarA.A("getGroups");
        awsbVarA.k(new awsc((awsd) new awsj(arrayList).apply(new awsd())));
        int i = 2;
        awsbVarA.t(awoq.b.a, 2);
        int i2 = 1;
        awsbVarA.w(awse.b.a);
        ekgb<awqe> ekgbVarZ = awsbVarA.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
        for (awqe awqeVar : ekgbVarZ) {
            awqeVar.aA(0, "token");
            Object obj2 = awqeVar.a.b;
            obj2.getClass();
            awpx awpxVar = new awpx((UUID) obj2);
            awqeVar.getClass();
            awqeVar.aA(i2, "group_type");
            awpy awpyVar = awqeVar.b;
            if (awpyVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iOrdinal = awpyVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != i2) {
                    throw new fctg();
                }
                throw new fcth("An operation is not implemented: GroupDetails for MMS is not yet implemented.");
            }
            awqeVar.aA(i, "rcs_conference_uri");
            String str = awqeVar.c;
            awml awmlVar = str != null ? new awml(str) : null;
            awqeVar.aA(5, "rcs_group_state");
            awmu awmuVar = awqeVar.f;
            awmuVar.getClass();
            awqeVar.aA(3, "name");
            String str2 = awqeVar.d;
            awqeVar.aA(4, "rcs_icon_url");
            Uri uri = awqeVar.e;
            awqeVar.aA(6, "tachygram_group_routing_token");
            byte[] bArr = awqeVar.g;
            evqs evqsVarA = bArr != null ? evwm.a(bArr) : null;
            awqeVar.aA(7, "rcs_group_capabilities");
            cigb cigbVar = awqeVar.h;
            cigbVar.getClass();
            awqeVar.aA(8, "rcs_group_last_sync_timestamp");
            Instant instant = awqeVar.i;
            instant.getClass();
            awqeVar.aA(9, "rcs_name_last_change_timestamp");
            Instant instant2 = awqeVar.j;
            instant2.getClass();
            awqeVar.aA(10, "rcs_join_link_url");
            awmt awmtVar = new awmt(awmlVar, awmuVar, str2, uri, evqsVarA, cigbVar, instant, instant2, awqeVar.k);
            dqpd[] dqpdVarArrAH = awqeVar.aH("group_members", new awnr[0]);
            dqpdVarArrAH.getClass();
            awnr[] awnrVarArr = (awnr[]) dqpdVarArrAH;
            ArrayList arrayList2 = new ArrayList(awnrVarArr.length);
            for (awnr awnrVar : awnrVarArr) {
                awnrVar.aA(1, "destination_token");
                awjl awjlVar = awnrVar.b;
                awjlVar.getClass();
                arrayList2.add(new awnk(awjlVar));
            }
            fcti fctiVar = new fcti(awpxVar, new awmr(awmtVar, fcva.av(arrayList2)));
            linkedHashMap.put(fctiVar.a, fctiVar.b);
            i2 = 1;
            i = 2;
        }
        return linkedHashMap;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awsi awsiVar = new awsi(fcxyVar, this.a, this.b);
        awsiVar.c = obj;
        return awsiVar;
    }
}
