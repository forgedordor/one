package defpackage;

import android.os.Bundle;
import android.text.SpannedString;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eulp {
    public final CharSequence a;
    public final eukf b;
    public final Bundle c;

    public eulp(CharSequence charSequence, eukf eukfVar, Bundle bundle) {
        this.a = SpannedString.valueOf(charSequence);
        this.b = eukfVar == null ? new euke().a() : eukfVar;
        this.c = bundle;
    }
}
