package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oij extends okq {
    public oij() {
        super(false);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return Long.valueOf(j);
        }
        pit.a(str);
        throw new fcta();
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object c(String str) throws NumberFormatException {
        String strSubstring;
        long j;
        str.getClass();
        if (fdgn.n(str, "L")) {
            strSubstring = str.substring(0, str.length() - 1);
            strSubstring.getClass();
        } else {
            strSubstring = str;
        }
        if (fdgn.t(str, "0x")) {
            String strSubstring2 = strSubstring.substring(2);
            strSubstring2.getClass();
            j = Long.parseLong(strSubstring2, 16);
        } else {
            j = Long.parseLong(strSubstring);
        }
        return Long.valueOf(j);
    }

    @Override // defpackage.okq
    public final String e() {
        return ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG;
    }

    @Override // defpackage.okq
    public final /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        bundle.putLong(str, ((Number) obj).longValue());
    }
}
