package defpackage;

import android.net.Uri;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ajwj implements ajts {
    @Override // defpackage.ajts
    public abstract int A();

    @Override // defpackage.ajts
    public abstract int B();

    @Override // defpackage.ajts
    public abstract long C();

    public abstract ajwi D();

    @Override // defpackage.ajts
    public abstract akgk E();

    @Override // defpackage.ajts
    public abstract avoe F();

    @Override // defpackage.ajts
    public abstract awjl G();

    @Override // defpackage.ajts
    public abstract cins H();

    @Override // defpackage.ajts
    public abstract elwp I();

    @Override // defpackage.ajts
    public abstract Instant J();

    @Override // defpackage.ajts
    public abstract Instant K();

    @Override // defpackage.ajts
    public abstract String L();

    @Override // defpackage.ajts
    public abstract String M();

    @Override // defpackage.ajts
    public abstract String N();

    @Override // defpackage.ajts
    public abstract boolean O();

    @Override // defpackage.ajts
    public abstract boolean P();

    public abstract void Q();

    @Override // defpackage.ajts
    public final /* synthetic */ boolean R() {
        return ajtr.a(this);
    }

    @Override // defpackage.ajts
    public final boolean S() {
        return O() || bvdi.d(A());
    }

    @Override // defpackage.ajlk
    public abstract Uri a();

    @Override // defpackage.ajlk
    public abstract Uri b();

    @Override // defpackage.ajlk
    public final ajlj c() {
        return z() ? ajlj.UNKNOWN : O() ? ajlj.RBM : bvdi.b(A()) ? ajlj.GROUP : ajlj.ONE_ON_ONE;
    }

    @Override // defpackage.ajlk
    public abstract akbk e();

    @Override // defpackage.ajlk
    public abstract akbl f();

    @Override // defpackage.ajlk
    public abstract akcy g();

    @Override // defpackage.ajlk
    public abstract aoer h();

    @Override // defpackage.ajlk
    public abstract cbqz j();

    @Override // defpackage.ajlk
    public abstract cgrb k();

    @Override // defpackage.ajlk
    public abstract cgrc l();

    @Override // defpackage.ajlk
    public abstract String m();

    @Override // defpackage.ajlk
    public final boolean n() {
        if (c() != ajlj.RBM) {
            return (bvdi.d(A()) && B() == 2) ? false : true;
        }
        return false;
    }

    @Override // defpackage.ajlk
    public abstract boolean o();

    @Override // defpackage.ajlk
    public abstract boolean q();

    @Override // defpackage.ajlk
    public abstract boolean r();

    @Override // defpackage.ajlk
    public abstract boolean s();

    public final String toString() {
        return "BugleConversationProperties: {\n  id: " + d().toString() + "\n  kind: " + String.valueOf(c()) + "\n  ConversationType: " + bvdi.a(A()) + "\n  name: " + cqcv.b(m()) + "\n  nameIsAutomatic: " + w() + "\n  archiveStatus: " + i().toString() + "\n  isDeleted: " + z() + "\n  activeSelfIdentity: " + String.valueOf(h()) + "\n  icon: " + cqcv.f(a()) + "\n  isUnread: " + u() + "\n  isEncrypted: " + t() + "\n  encryptionProtocol: " + j().toString() + "\n  encryptionId: null\n  wasPreviouslyEncrypted: " + y() + "\n  hasRbmBotRecipient: " + O() + "\n  errorState: " + F().name() + "\n  joinState: " + B() + "\n  sendMode: " + I().name() + "\n  rcsConferenceUri: " + M() + "\n  rcsGroupId: " + N() + "\n  rcsChatSessionId: " + C() + "\n  wasRcs: " + ajtr.a(this) + "\n  sessionAllowsRevocation: " + P() + "\n  participantNormalizedDestination: " + cqcv.e(L()) + "\n  parentalApprovalStatus: " + f().toString() + "\n parentSupervisionStates: " + e().toString() + "\n  canRemovePeople: " + o() + "\n  getCanAddPeople: " + n() + "\n  getCanUpdateGroupName: " + r() + "\n  getCanUpdateGroupIcon: " + q() + "\n  mmsGroupUpgradeStatus: " + H().toString() + "\n  palMode: " + E().toString() + "\n  longPressActionsEnabled: " + v() + "\n  shouldShowSimName: " + x() + "\n destinationToken: " + G().toString() + "\n conversationMuteThreshold: " + l().toString() + "\n conversationMuteStatus: " + k().toString() + "\n inviteLink: " + String.valueOf(b()) + "\n canUpdateInviteLink: " + s() + "\n}";
    }

    @Override // defpackage.ajlk
    public abstract boolean v();

    @Override // defpackage.ajlk
    public abstract boolean x();
}
