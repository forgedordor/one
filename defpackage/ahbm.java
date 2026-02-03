package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.privacy.etouffeetoggle.EtouffeeToggleActivity;
import com.google.android.apps.messaging.privacy.identitydetails.IdentityDetailsActivity;
import com.google.android.apps.messaging.privacy.settings.PrivacySettingsActivity;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahbm implements ahbk {
    private final bvur a;
    private final fcsu b;

    public ahbm(fcsu fcsuVar, bvur bvurVar) {
        this.b = fcsuVar;
        this.a = bvurVar;
    }

    @Override // defpackage.ahbk
    public final Intent a(Context context, ahci ahciVar) {
        if (!this.a.m()) {
            throw new UnsupportedOperationException("Configuration disabled for etouffee");
        }
        Intent intent = new Intent(context, (Class<?>) IdentityDetailsActivity.class);
        ProtoParsers.i(intent, "arguments", ahciVar);
        return intent;
    }

    @Override // defpackage.ahbk
    public final Intent b(Context context, ResolvedRecipient resolvedRecipient, aoer aoerVar) {
        aubq aubqVar = (aubq) aoerVar.o().flatMap(new Function() { // from class: ahbl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((alqm) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseThrow();
        String str = resolvedRecipient.F().a;
        int iD = ((crny) this.b.b()).h(aoerVar.b()).d() + 1;
        ahcy ahcyVar = (ahcy) ahcz.a.createBuilder();
        ahcyVar.copyOnWrite();
        ahcz ahczVar = (ahcz) ahcyVar.instance;
        ahczVar.b |= 1;
        ahczVar.c = iD;
        int iA = aoerVar.a();
        ahcyVar.copyOnWrite();
        ahcz ahczVar2 = (ahcz) ahcyVar.instance;
        ahczVar2.b |= 2;
        ahczVar2.d = iA;
        String strR = aoerVar.r();
        ahcyVar.copyOnWrite();
        ahcz ahczVar3 = (ahcz) ahcyVar.instance;
        ahczVar3.b |= 4;
        ahczVar3.e = strR;
        ahcz ahczVar4 = (ahcz) ahcyVar.build();
        ahch ahchVar = (ahch) ahci.a.createBuilder();
        ahchVar.copyOnWrite();
        ahci ahciVar = (ahci) ahchVar.instance;
        str.getClass();
        ahciVar.b |= 2;
        ahciVar.d = str;
        ahchVar.copyOnWrite();
        ahci ahciVar2 = (ahci) ahchVar.instance;
        aubqVar.getClass();
        ahciVar2.c = aubqVar;
        ahciVar2.b |= 1;
        ahchVar.copyOnWrite();
        ahci ahciVar3 = (ahci) ahchVar.instance;
        ahczVar4.getClass();
        ahciVar3.e = ahczVar4;
        ahciVar3.b |= 4;
        return a(context, ahchVar.build());
    }

    @Override // defpackage.ahbk
    public final Intent c(Context context) {
        if (this.a.l()) {
            return new Intent(context, (Class<?>) PrivacySettingsActivity.class);
        }
        throw new UnsupportedOperationException("Configuration disabled for etouffee");
    }

    @Override // defpackage.ahbk
    public final Intent d(Context context) {
        if (this.a.q()) {
            return new Intent(context, (Class<?>) EtouffeeToggleActivity.class);
        }
        throw new UnsupportedOperationException("Configuration disabled for etouffee toggle");
    }
}
