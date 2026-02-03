package defpackage;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxa {
    public final CharSequence a;
    public final IconCompat b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public kxa(kwz kwzVar) {
        this.a = kwzVar.a;
        this.b = kwzVar.b;
        this.c = kwzVar.c;
        this.d = kwzVar.d;
        this.e = kwzVar.e;
        this.f = kwzVar.f;
    }

    public static kxa b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        kwz kwzVar = new kwz();
        kwzVar.a = bundle.getCharSequence("name");
        kwzVar.b = bundle2 != null ? IconCompat.f(bundle2) : null;
        kwzVar.c = bundle.getString(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        kwzVar.d = bundle.getString("key");
        kwzVar.e = bundle.getBoolean("isBot");
        kwzVar.f = bundle.getBoolean("isImportant");
        return new kxa(kwzVar);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.e() : null);
        bundle.putString(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof kxa)) {
            return false;
        }
        kxa kxaVar = (kxa) obj;
        String str = this.d;
        String str2 = kxaVar.d;
        if (str != null || str2 != null) {
            return Objects.equals(str, str2);
        }
        if (Objects.equals(Objects.toString(this.a), Objects.toString(kxaVar.a)) && Objects.equals(this.c, kxaVar.c)) {
            if (Objects.equals(Boolean.valueOf(this.e), Boolean.valueOf(kxaVar.e))) {
                if (Objects.equals(Boolean.valueOf(this.f), Boolean.valueOf(kxaVar.f))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
