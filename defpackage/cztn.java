package defpackage;

import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cztn extends PhoneNumberFormattingTextWatcher {
    final /* synthetic */ czte a;

    public cztn(czte czteVar) {
        this.a = czteVar;
    }

    @Override // android.telephony.PhoneNumberFormattingTextWatcher, android.text.TextWatcher
    public final synchronized void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        this.a.a().setEnabled(!r2.h().isEmpty());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cztn(czte czteVar, String str) {
        super(str);
        this.a = czteVar;
    }
}
