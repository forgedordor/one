package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.Prekey;
import com.google.communication.synapse.security.scytale.PrekeyBundle;
import com.google.communication.synapse.security.scytale.UserDevices;
import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwkz {
    public static final cepz a = cepz.c("Bugle.Etouffee.DownloadPreKeys");
    public static final cepz b = cepz.c("Bugle.Etouffee.UploadPreKeys");
    public final eygg c;
    public final String d;
    public final fcsu e;
    private final eosc f;

    public bwkz(eygg eyggVar, String str, fcsu fcsuVar, eosc eoscVar) {
        this.c = eyggVar;
        this.d = str;
        this.e = fcsuVar;
        this.f = eoscVar;
    }

    public static Prekey a(ezow ezowVar) {
        return new Prekey(ezowVar.b, ezowVar.c.I(), ezowVar.d.I());
    }

    public final void b(Status status) {
        exmt exmtVarB = exmt.b(status.getCode().value());
        aill aillVar = (aill) this.e.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_E2EE_FETCH_PREKEYS_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        elxv elxvVar = (elxv) elxw.a.createBuilder();
        elxvVar.copyOnWrite();
        elxw elxwVar = (elxw) elxvVar.instance;
        elxwVar.c = exmtVarB.a();
        elxwVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elxw elxwVar2 = (elxw) elxvVar.build();
        elxwVar2.getClass();
        ellhVar2.aD = elxwVar2;
        ellhVar2.e |= 32;
        aillVar.j(ellgVar);
    }

    public final ListenableFuture c(final ArrayList arrayList) {
        return ((cema) this.c.b()).b(new bwbq(arrayList, this.d), a).e(fbtf.class, new ejvr() { // from class: bwkx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                this.a.b(fbtfVar.a);
                throw fbtfVar;
            }
        }, this.f).h(new ejvr() { // from class: bwky
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Prekey prekeyA;
                ezvi ezviVar = (ezvi) obj;
                ArrayList arrayList2 = new ArrayList();
                for (ezvh ezvhVar : ezviVar.c) {
                    for (ezvg ezvgVar : ezvhVar.c) {
                        if ((ezvgVar.b & 2) != 0) {
                            int i = ezvgVar.c;
                            ezol ezolVar = ezvhVar.b;
                            if (ezolVar == null) {
                                ezolVar = ezol.a;
                            }
                            String str = ezolVar.c;
                            String strE = ezvgVar.d.E();
                            if ((ezvgVar.b & 1) != 0) {
                                ezow ezowVar = ezvgVar.f;
                                if (ezowVar == null) {
                                    ezowVar = ezow.a;
                                }
                                prekeyA = bwkz.a(ezowVar);
                            } else {
                                prekeyA = null;
                            }
                            Prekey prekey = prekeyA;
                            ezow ezowVar2 = ezvgVar.g;
                            if (ezowVar2 == null) {
                                ezowVar2 = ezow.a;
                            }
                            arrayList2.add(new PrekeyBundle(i, str, strE, prekey, bwkz.a(ezowVar2), ezvgVar.e.I()));
                        }
                    }
                }
                bwkz bwkzVar = this.a;
                if (arrayList2.isEmpty()) {
                    Status status = Status.g;
                    bwkzVar.b(status);
                    return StatusOr.fromStatus(status);
                }
                ArrayList arrayList3 = arrayList;
                int size = arrayList3.size();
                int size2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    size2 += ((UserDevices) arrayList3.get(i2)).getDeviceIds().size();
                }
                int size3 = arrayList3.size();
                int size4 = ezviVar.c.size();
                int size5 = arrayList2.size();
                aill aillVar = (aill) bwkzVar.e.b();
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.BUGLE_E2EE_FETCH_PREKEYS_EVENT;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                elxv elxvVar = (elxv) elxw.a.createBuilder();
                exmt exmtVar = exmt.OK;
                elxvVar.copyOnWrite();
                elxw elxwVar = (elxw) elxvVar.instance;
                elxwVar.c = exmtVar.a();
                elxwVar.b |= 1;
                elxvVar.copyOnWrite();
                elxw elxwVar2 = (elxw) elxvVar.instance;
                elxwVar2.b |= 2;
                elxwVar2.d = size3;
                elxvVar.copyOnWrite();
                elxw elxwVar3 = (elxw) elxvVar.instance;
                elxwVar3.b |= 4;
                elxwVar3.e = size4;
                elxvVar.copyOnWrite();
                elxw elxwVar4 = (elxw) elxvVar.instance;
                elxwVar4.b |= 8;
                elxwVar4.f = size2;
                elxvVar.copyOnWrite();
                elxw elxwVar5 = (elxw) elxvVar.instance;
                elxwVar5.b |= 16;
                elxwVar5.g = size5;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                elxw elxwVar6 = (elxw) elxvVar.build();
                elxwVar6.getClass();
                ellhVar2.aD = elxwVar6;
                ellhVar2.e |= 32;
                aillVar.j(ellgVar);
                return StatusOr.fromValue(arrayList2);
            }
        }, eoqg.a);
    }
}
