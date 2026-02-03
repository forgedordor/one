package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpls extends cprt {
    private final MessageCoreData a;
    private final ParticipantsTable.BindData b;
    private final ParticipantsTable.BindData c;
    private final bojh d;
    private final bpvd e;
    private final ekgb f;
    private final ekgb g;
    private final ekgp h;
    private final ekgb i;

    public cpls(MessageCoreData messageCoreData, ParticipantsTable.BindData bindData, ParticipantsTable.BindData bindData2, bojh bojhVar, bpvd bpvdVar, ekgb ekgbVar, ekgb ekgbVar2, ekgp ekgpVar, ekgb ekgbVar3) {
        this.a = messageCoreData;
        this.b = bindData;
        this.c = bindData2;
        this.d = bojhVar;
        this.e = bpvdVar;
        this.f = ekgbVar;
        this.g = ekgbVar2;
        this.h = ekgpVar;
        this.i = ekgbVar3;
    }

    @Override // defpackage.cprt
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.cprt
    public final bojh b() {
        return this.d;
    }

    @Override // defpackage.cprt
    public final bpvd c() {
        return this.e;
    }

    @Override // defpackage.cprt
    public final ParticipantsTable.BindData d() {
        return this.c;
    }

    @Override // defpackage.cprt
    public final ParticipantsTable.BindData e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ParticipantsTable.BindData bindData;
        ParticipantsTable.BindData bindData2;
        bojh bojhVar;
        bpvd bpvdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cprt) {
            cprt cprtVar = (cprt) obj;
            if (this.a.equals(cprtVar.a()) && ((bindData = this.b) != null ? bindData.equals(cprtVar.e()) : cprtVar.e() == null) && ((bindData2 = this.c) != null ? bindData2.equals(cprtVar.d()) : cprtVar.d() == null) && ((bojhVar = this.d) != null ? bojhVar.equals(cprtVar.b()) : cprtVar.b() == null) && ((bpvdVar = this.e) != null ? bpvdVar.equals(cprtVar.c()) : cprtVar.c() == null) && ekjz.h(this.f, cprtVar.f()) && ekjz.h(this.g, cprtVar.h()) && this.h.equals(cprtVar.i()) && ekjz.h(this.i, cprtVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cprt
    public final ekgb f() {
        return this.f;
    }

    @Override // defpackage.cprt
    public final ekgb g() {
        return this.i;
    }

    @Override // defpackage.cprt
    public final ekgb h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        ParticipantsTable.BindData bindData = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (bindData == null ? 0 : bindData.hashCode())) * 1000003;
        ParticipantsTable.BindData bindData2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (bindData2 == null ? 0 : bindData2.hashCode())) * 1000003;
        bojh bojhVar = this.d;
        int iHashCode4 = (iHashCode3 ^ (bojhVar == null ? 0 : bojhVar.hashCode())) * 1000003;
        bpvd bpvdVar = this.e;
        return ((((((((iHashCode4 ^ (bpvdVar != null ? bpvdVar.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.cprt
    public final ekgp i() {
        return this.h;
    }

    public final String toString() {
        ekgb ekgbVar = this.i;
        ekgp ekgpVar = this.h;
        ekgb ekgbVar2 = this.g;
        ekgb ekgbVar3 = this.f;
        bpvd bpvdVar = this.e;
        bojh bojhVar = this.d;
        ParticipantsTable.BindData bindData = this.c;
        ParticipantsTable.BindData bindData2 = this.b;
        return "CmsMessageObjectData{message=" + this.a.toString() + ", senderParticipant=" + String.valueOf(bindData2) + ", selfParticipant=" + String.valueOf(bindData) + ", conversation=" + String.valueOf(bojhVar) + ", linkPreview=" + String.valueOf(bpvdVar) + ", conversationSuggestions=" + ekgbVar3.toString() + ", spamSources=" + ekgbVar2.toString() + ", cmsData=" + ekgpVar.toString() + ", messageAnnotations=" + ekgbVar.toString() + "}";
    }
}
