package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zto extends fcyz implements fdap {
    final /* synthetic */ alff a;
    final /* synthetic */ ztv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zto(alff alffVar, ztv ztvVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = alffVar;
        this.b = ztvVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String propertyValue = ((bbdq) this.a).a.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER);
        boolean z = false;
        if (TextUtils.isEmpty(propertyValue)) {
            ((ekrd) ztv.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl$onClickV2$primaryActionHandler$8", "invokeSuspend", 345, "SuggestionUiAdapterImpl.kt")).q("suggestion type phone has empty number. Cannot create call intent.");
        } else {
            fcsu fcsuVar = this.b.v;
            Intent intentA = ((cpbz) fcsuVar.b()).a(propertyValue);
            if (intentA != null && ((cpbz) fcsuVar.b()).e(intentA)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new zto(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
