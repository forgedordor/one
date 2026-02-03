package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwu extends fcyz implements fdat {
    final /* synthetic */ www a;
    final /* synthetic */ MessageId b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwu(fcxy fcxyVar, www wwwVar, MessageId messageId) {
        super(2, fcxyVar);
        this.a = wwwVar;
        this.b = messageId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wwu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        www wwwVar = this.a;
        zwf zwfVar = wwwVar.f;
        zwfVar.b = zwfVar.a.b(188415, null);
        ekrw ekrwVarF = www.a.f();
        ekrwVarF.X(eksq.a, "BugleComposeRow2");
        ekrd ekrdVar = (ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replies/DraftReplyUiAdapterImpl$setReplyTo$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 98, "DraftReplyUiAdapterImpl.kt");
        MessageId messageId = this.b;
        ekrdVar.t("setReplyTo %s", messageId);
        fdce fdceVar = new fdce();
        wwwVar.e.a(new wwv(fdceVar, wwwVar, messageId));
        if (fdceVar.a) {
            wwwVar.g.i();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wwu wwuVar = new wwu(fcxyVar, this.a, this.b);
        wwuVar.c = obj;
        return wwuVar;
    }
}
