package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.axzi;
import defpackage.axzj;
import defpackage.baci;
import defpackage.cqdn;
import defpackage.craf;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.elgm;
import defpackage.eosd;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RebuildShortcutsAction extends ThrottledAction {
    public final baci b;
    public final eosd c;
    public final eosd d;
    private final Optional f;
    public static final eksp a = eksp.c("BugleShortcuts");
    private static final long e = TimeUnit.SECONDS.toMillis(60);
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new axzi();

    /* compiled from: PG */
    public interface a {
        axzj ib();
    }

    public RebuildShortcutsAction(Context context, Optional<cqdn> optional, baci baciVar, eosd eosdVar, eosd eosdVar2) {
        super(elgm.REBUILD_SHORTCUTS_ACTION);
        this.f = optional;
        this.b = baciVar;
        this.c = eosdVar;
        this.d = eosdVar2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("RebuildShortcutsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RebuildShortCuts.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 107;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return e;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "RebuildShortcutsAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        if (craf.d) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/datamodel/action/RebuildShortcutsAction", "doThrottledWork", 104, "RebuildShortcutsAction.java")).q("Device is R+, not rebuilding shortcuts");
        } else {
            this.f.ifPresent(new Consumer() { // from class: axzg
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    eiju eijuVarJ = ((cqdn) obj).j();
                    final RebuildShortcutsAction rebuildShortcutsAction = this.a;
                    eika.l(eijuVarJ.h(new ejvr() { // from class: axzf
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            rebuildShortcutsAction.b.a();
                            return null;
                        }
                    }, rebuildShortcutsAction.d), new axzh(), rebuildShortcutsAction.c);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RebuildShortcutsAction(Context context, Optional<cqdn> optional, baci baciVar, eosd eosdVar, eosd eosdVar2, Parcel parcel) {
        super(parcel, elgm.REBUILD_SHORTCUTS_ACTION);
        this.f = optional;
        this.b = baciVar;
        this.c = eosdVar;
        this.d = eosdVar2;
    }
}
