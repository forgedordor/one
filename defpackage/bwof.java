package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.ConversationCode;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.UserDevice;
import com.google.media.webrtc.common.StatusOr;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwof implements ehaw {
    final /* synthetic */ aubq a;
    final /* synthetic */ String b;
    final /* synthetic */ bwog c;

    public bwof(bwog bwogVar, aubq aubqVar, String str) {
        this.a = aubqVar;
        this.b = str;
        this.c = bwogVar;
    }

    @Override // defpackage.ehaw
    public final /* bridge */ /* synthetic */ egyk a() {
        return new egyb("identity_details_data_service_" + this.a.d + "_" + this.b);
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        final bwog bwogVar = this.c;
        if (!bwogVar.f.m()) {
            return eijx.e(Optional.empty());
        }
        final String str = this.b;
        aubq aubqVar = this.a;
        Callable callable = new Callable() { // from class: bwod
            @Override // java.util.concurrent.Callable
            public final Object call() {
                bwog bwogVar2 = bwogVar;
                ParticipantsTable.BindData bindDataB = ((bbca) bwogVar2.i.b()).b(str);
                if (bindDataB == null) {
                    return Optional.empty();
                }
                String strT = bindDataB.T();
                return strT == null ? Optional.empty() : Optional.ofNullable(((asqx) bwogVar2.k.b()).a(strT, false));
            }
        };
        eosc eoscVar = bwogVar.d;
        final eiju eijuVarI = eijx.g(callable, eoscVar).i(new eooz() { // from class: bwoc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    return eijx.e(Optional.empty());
                }
                bwog bwogVar2 = bwogVar;
                return bwogVar2.j.b(((aubq) optional.get()).d).h(new ejvr() { // from class: bwob
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Optional optional2 = (Optional) obj2;
                        return optional2.isPresent() ? Optional.of(new UserDevice(((aubq) optional.get()).d, (String) optional2.get())) : Optional.empty();
                    }
                }, bwogVar2.e);
            }
        }, bwogVar.e);
        final eiju eijuVarB = ((bwbn) bwogVar.g.b()).b(aubqVar.d);
        final eiju eijuVarE = eijx.e(aubqVar.d);
        return eijx.k(eijuVarE, eijuVarB, eijuVarI).a(new Callable() { // from class: bwoe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = (String) eork.q(eijuVarE);
                NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) eork.q(eijuVarB);
                Optional optional = (Optional) eork.q(eijuVarI);
                if (optional.isPresent()) {
                    bwog bwogVar2 = bwogVar;
                    StatusOr<ConversationCode> conversationCode = nativeMessageEncryptorV2.getConversationCode(Scope.create(bwogVar2.h.b()), str2, (UserDevice) optional.get());
                    if (conversationCode.hasValue) {
                        if (bwogVar2.b.a()) {
                            String userId = ((UserDevice) optional.get()).getUserId();
                            bvwk bvwkVar = bwogVar2.c;
                            bvxa bvxaVar = (bvxa) bvxd.a.createBuilder();
                            bvxb bvxbVar = (bvxb) bvxc.a.createBuilder();
                            bvxbVar.copyOnWrite();
                            bvxc bvxcVar = (bvxc) bvxbVar.instance;
                            userId.getClass();
                            bvxcVar.b = userId;
                            bvxaVar.a((bvxc) bvxbVar.build());
                            bvwkVar.a((bvxd) bvxaVar.build());
                        }
                        return Optional.of(conversationCode.value.getPrintableCode());
                    }
                    cqbd cqbdVarE = bwog.a.e();
                    cqbdVarE.I("scytale getConversationCode status not ok");
                    cqbdVarE.A("Status", conversationCode.status);
                    cqbdVarE.r();
                }
                return Optional.empty();
            }
        }, eoscVar);
    }
}
