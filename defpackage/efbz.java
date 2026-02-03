package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_GroupInformation;
import com.google.android.rcs.client.messaging.GroupInformation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbz extends efed {
    public String a;
    public ekfw b;
    public ekgb c;
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();
    private String f;
    private String g;

    @Override // defpackage.efed
    public final GroupInformation a() {
        String str;
        String str2;
        ekfw ekfwVar = this.b;
        if (ekfwVar != null) {
            this.c = ekfwVar.g();
        } else if (this.c == null) {
            int i = ekgb.d;
            this.c = ekoe.a;
        }
        String str3 = this.a;
        if (str3 != null && (str = this.f) != null && (str2 = this.g) != null) {
            return new AutoValue_GroupInformation(str3, str, str2, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.f == null) {
            sb.append(" subject");
        }
        if (this.g == null) {
            sb.append(" conferenceUri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.efed
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null conferenceUri");
        }
        this.g = str;
    }

    @Override // defpackage.efed
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null subject");
        }
        this.f = str;
    }
}
