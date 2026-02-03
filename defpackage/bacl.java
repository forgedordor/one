package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bacl extends bage {
    private final bojh a;
    private final bafo b;
    private final Optional c;
    private final ParticipantsTable.BindData d;
    private final ParticipantsTable.BindData e;
    private final boolean f;
    private final bvdk g;
    private final Optional h;
    private final Optional i;
    private final Optional j;

    public bacl(bojh bojhVar, bafo bafoVar, Optional optional, ParticipantsTable.BindData bindData, ParticipantsTable.BindData bindData2, boolean z, bvdk bvdkVar, Optional optional2, Optional optional3, Optional optional4) {
        if (bojhVar == null) {
            throw new NullPointerException("Null conversationBindData");
        }
        this.a = bojhVar;
        if (bafoVar == null) {
            throw new NullPointerException("Null conversationParticipantData");
        }
        this.b = bafoVar;
        if (optional == null) {
            throw new NullPointerException("Null e2eeInfoResult");
        }
        this.c = optional;
        if (bindData == null) {
            throw new NullPointerException("Null firstSender");
        }
        this.d = bindData;
        this.e = bindData2;
        this.f = z;
        if (bvdkVar == null) {
            throw new NullPointerException("Null archiveStatus");
        }
        this.g = bvdkVar;
        if (optional2 == null) {
            throw new NullPointerException("Null ringtoneTitle");
        }
        this.h = optional2;
        if (optional3 == null) {
            throw new NullPointerException("Null availableSelfIdentities");
        }
        this.i = optional3;
        if (optional4 == null) {
            throw new NullPointerException("Null activeSelfIdentity");
        }
        this.j = optional4;
    }

    @Override // defpackage.bage
    public final bafo a() {
        return this.b;
    }

    @Override // defpackage.bage
    public final bojh b() {
        return this.a;
    }

    @Override // defpackage.bage
    public final ParticipantsTable.BindData c() {
        return this.d;
    }

    @Override // defpackage.bage
    public final ParticipantsTable.BindData d() {
        return this.e;
    }

    @Override // defpackage.bage
    public final bvdk e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        ParticipantsTable.BindData bindData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bage) {
            bage bageVar = (bage) obj;
            if (this.a.equals(bageVar.b()) && this.b.equals(bageVar.a()) && this.c.equals(bageVar.h()) && this.d.equals(bageVar.c()) && ((bindData = this.e) != null ? bindData.equals(bageVar.d()) : bageVar.d() == null) && this.f == bageVar.j() && this.g.equals(bageVar.e()) && this.h.equals(bageVar.i()) && this.i.equals(bageVar.g()) && this.j.equals(bageVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bage
    public final Optional f() {
        return this.j;
    }

    @Override // defpackage.bage
    public final Optional g() {
        return this.i;
    }

    @Override // defpackage.bage
    public final Optional h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        ParticipantsTable.BindData bindData = this.e;
        return (((((((((((iHashCode * 1000003) ^ (bindData == null ? 0 : bindData.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.bage
    public final Optional i() {
        return this.h;
    }

    @Override // defpackage.bage
    public final boolean j() {
        return this.f;
    }

    public final String toString() {
        Optional optional = this.j;
        Optional optional2 = this.i;
        Optional optional3 = this.h;
        bvdk bvdkVar = this.g;
        ParticipantsTable.BindData bindData = this.e;
        ParticipantsTable.BindData bindData2 = this.d;
        Optional optional4 = this.c;
        bafo bafoVar = this.b;
        return "OptionsListData{conversationBindData=" + this.a.toString() + ", conversationParticipantData=" + bafoVar.toString() + ", e2eeInfoResult=" + optional4.toString() + ", firstSender=" + bindData2.toString() + ", reportableParticipant=" + String.valueOf(bindData) + ", etouffeeCapable=" + this.f + ", archiveStatus=" + bvdkVar.toString() + ", ringtoneTitle=" + optional3.toString() + ", availableSelfIdentities=" + optional2.toString() + ", activeSelfIdentity=" + optional.toString() + "}";
    }
}
