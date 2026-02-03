package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class ctps extends fdbo implements fdat {
    public ctps(Object obj) {
        super(2, obj, ctqd.class, "onClick", "onClick(Lcom/google/android/apps/messaging/shared/api/messaging/identity/MessagingIdentity;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)V", 0);
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        alqm alqmVar = (alqm) obj;
        cudx cudxVar = (cudx) obj2;
        alqmVar.getClass();
        cudxVar.getClass();
        ctqd ctqdVar = (ctqd) this.g;
        ctqdVar.c.c(new ChipData(alqmVar, udo.a(alqmVar), null, null, false, 28, null));
        if (cudxVar.d == cueh.a) {
            auvw.k(ctqdVar.d, null, null, new ctpy(ctqdVar, alqmVar, null), 3);
        }
        return fctx.a;
    }
}
