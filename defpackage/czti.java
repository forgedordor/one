package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.rcs.setup.manual.CountryCodePickerActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czti extends adx {
    final /* synthetic */ czte a;

    public czti(czte czteVar) {
        this.a = czteVar;
    }

    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        czte czteVar = this.a;
        Intent intent = new Intent(czteVar.d.fg(), (Class<?>) CountryCodePickerActivity.class);
        ecww ecwwVar = czteVar.r;
        intent.putExtra("com.google.android.apps.messaging.ui.rcs.setup.manual.extra.COUNTRY_CODE_SELECTED", ecwwVar == null ? null : ecwwVar.toByteArray());
        return intent;
    }

    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i == -1 && intent != null) {
            try {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.apps.messaging.ui.rcs.setup.manual.extra.COUNTRY_CODE_SELECTED");
                if (byteArrayExtra != null) {
                    return (ecww) evsn.parseFrom(ecww.a, byteArrayExtra, evrr.a());
                }
            } catch (evtj unused) {
            }
        }
        return this.a.f();
    }
}
