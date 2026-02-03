package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;
import com.google.android.rcs.client.messaging.data.SubjectExtension;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efhq extends efjc {
    public ekfw a;
    public ekgb b;
    private String c;
    private String d;
    private String e;
    private Optional f = Optional.empty();
    private Optional g = Optional.empty();

    @Override // defpackage.efjc
    public final GroupInformation a() {
        String str;
        String str2;
        ekfw ekfwVar = this.a;
        if (ekfwVar != null) {
            this.b = ekfwVar.g();
        } else if (this.b == null) {
            int i = ekgb.d;
            this.b = ekoe.a;
        }
        String str3 = this.c;
        if (str3 != null && (str = this.d) != null && (str2 = this.e) != null) {
            return new AutoValue_GroupInformation(str3, str, str2, this.b, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" id");
        }
        if (this.d == null) {
            sb.append(" subject");
        }
        if (this.e == null) {
            sb.append(" conferenceUri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.efjc
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null conferenceUri");
        }
        this.e = str;
    }

    @Override // defpackage.efjc
    public final void c(GroupRemoteCapabilities groupRemoteCapabilities) {
        this.f = Optional.of(groupRemoteCapabilities);
    }

    @Override // defpackage.efjc
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.c = str;
    }

    @Override // defpackage.efjc
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null subject");
        }
        this.d = str;
    }

    @Override // defpackage.efjc
    public final void f(SubjectExtension subjectExtension) {
        this.g = Optional.of(subjectExtension);
    }
}
