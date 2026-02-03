package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessSentMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyn implements aypy {
    private final fcsu a;
    private final fcsu b;

    public axyn(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
    }

    @Override // defpackage.aypy
    public final /* synthetic */ Action a(MessageIdType messageIdType, String str, int i, int i2) {
        axym axymVar = (axym) this.a.b();
        axymVar.getClass();
        return new ProcessSentMessageAction(axymVar, messageIdType, str, i, i2);
    }

    @Override // defpackage.aypy
    public final /* synthetic */ Action b(int i, Uri uri, Bundle bundle) {
        axym axymVar = (axym) this.a.b();
        axymVar.getClass();
        uri.getClass();
        bundle.getClass();
        return new ProcessSentMessageAction(axymVar, i, uri, bundle);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        axym axymVar = (axym) this.a.b();
        axymVar.getClass();
        parcel.getClass();
        return new ProcessSentMessageAction(axymVar, parcel);
    }

    @Override // defpackage.aypy
    public final /* synthetic */ Action d(basd basdVar, int i, long j, long j2, Duration duration) {
        axym axymVar = (axym) this.a.b();
        axymVar.getClass();
        duration.getClass();
        return new ProcessSentMessageAction(axymVar, basdVar, i, j, j2, duration);
    }

    @Override // defpackage.aypy
    public final /* synthetic */ Action e(basd basdVar, aubl aublVar, Instant instant, boolean z, elpg elpgVar, augm augmVar, enxu enxuVar) {
        axym axymVar = (axym) this.a.b();
        axymVar.getClass();
        aublVar.getClass();
        instant.getClass();
        elpgVar.getClass();
        augmVar.getClass();
        return new ProcessSentMessageAction(axymVar, basdVar, aublVar, instant, z, elpgVar, augmVar, enxuVar);
    }

    @Override // defpackage.aypy
    public final /* synthetic */ Action f(baro baroVar, int i, int i2) {
        axym axymVar = (axym) this.a.b();
        axymVar.getClass();
        return new ProcessSentMessageAction(axymVar, baroVar, i, i2);
    }

    @Override // defpackage.aypy
    public final /* synthetic */ Action g(MessageIdType messageIdType, Uri uri, int i, int i2, int i3, int i4, String str, Boolean bool) {
        axym axymVar = (axym) this.a.b();
        axymVar.getClass();
        cmqb cmqbVar = (cmqb) this.b.b();
        cmqbVar.getClass();
        return new ProcessSentMessageAction(axymVar, cmqbVar, messageIdType, uri, i, i2, i3, i4, str, bool);
    }

    @Override // defpackage.aypy
    public final /* bridge */ /* synthetic */ Action h(MessageIdType messageIdType, basd basdVar, Uri uri, Uri uri2, int i, int i2, int i3, int i4, enxu enxuVar, elpf elpfVar) {
        axym axymVar = (axym) this.a.b();
        axymVar.getClass();
        messageIdType.getClass();
        elpfVar.getClass();
        return new ProcessSentMessageAction(axymVar, messageIdType, basdVar, uri, uri2, i, i2, i3, i4, enxuVar, elpfVar);
    }
}
