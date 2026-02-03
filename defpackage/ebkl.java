package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ebkl extends ebkh {
    private final String a;

    protected ebkl(String str) {
        this.a = str;
    }

    protected final void a(StringBuilder sb) {
        sb.append(this.a);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof ebkl) && TextUtils.equals(this.a, ((ebkl) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
