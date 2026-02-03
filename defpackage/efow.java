package defpackage;

import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
class efow extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        GroupMember groupMember = (GroupMember) obj;
        cjhv cjhvVar = (cjhv) cjhy.a.createBuilder();
        String strD = groupMember.d();
        cjhvVar.copyOnWrite();
        cjhy cjhyVar = (cjhy) cjhvVar.instance;
        cjhyVar.b |= 1;
        cjhyVar.c = strD;
        ejvj ejvjVar = efqd.b;
        cjju cjjuVar = (cjju) ejvjVar.fH().fM(groupMember.b());
        cjhvVar.copyOnWrite();
        cjhy cjhyVar2 = (cjhy) cjhvVar.instance;
        cjjuVar.getClass();
        cjhyVar2.d = cjjuVar;
        cjhyVar2.b |= 2;
        if (groupMember.c().isPresent() && groupMember.c().isPresent()) {
            cjju cjjuVar2 = (cjju) ejvjVar.fH().fM(groupMember.c().get());
            cjhvVar.copyOnWrite();
            cjhy cjhyVar3 = (cjhy) cjhvVar.instance;
            cjjuVar2.getClass();
            cjhyVar3.e = cjjuVar2;
            cjhyVar3.b |= 4;
        }
        boolean zE = groupMember.e();
        cjhvVar.copyOnWrite();
        cjhy cjhyVar4 = (cjhy) cjhvVar.instance;
        cjhyVar4.b |= 8;
        cjhyVar4.f = zE;
        cjhx cjhxVar = (cjhx) efqd.a.fH().fM(groupMember.a());
        cjhvVar.copyOnWrite();
        cjhy cjhyVar5 = (cjhy) cjhvVar.instance;
        cjhyVar5.g = cjhxVar.e;
        cjhyVar5.b |= 16;
        return (cjhy) cjhvVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjhy cjhyVar = (cjhy) obj;
        efje efjeVarF = GroupMember.f();
        if ((cjhyVar.b & 1) != 0) {
            efjeVarF.b(cjhyVar.c);
        }
        if ((cjhyVar.b & 2) != 0) {
            ejvj ejvjVar = efqd.b;
            cjju cjjuVar = cjhyVar.d;
            if (cjjuVar == null) {
                cjjuVar = cjju.a;
            }
            efjeVarF.c((RcsDestinationId) ejvjVar.fM(cjjuVar));
        }
        if ((cjhyVar.b & 4) != 0) {
            ejvj ejvjVar2 = efqd.b;
            cjju cjjuVar2 = cjhyVar.e;
            if (cjjuVar2 == null) {
                cjjuVar2 = cjju.a;
            }
            ((efhr) efjeVarF).a = Optional.of((RcsDestinationId) ejvjVar2.fM(cjjuVar2));
        }
        if ((cjhyVar.b & 8) != 0) {
            efjeVarF.d(cjhyVar.f);
        }
        if ((cjhyVar.b & 16) != 0) {
            ejvj ejvjVar3 = efqd.a;
            cjhx cjhxVarB = cjhx.b(cjhyVar.g);
            if (cjhxVarB == null) {
                cjhxVarB = cjhx.UNKNOWN_TYPE;
            }
            efjeVarF.f((efjf) ejvjVar3.fM(cjhxVarB));
        }
        return efjeVarF.a();
    }
}
