package defpackage;

import android.os.Bundle;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edoj {
    public static final ea a(etub etubVar) {
        Bundle bundle = new Bundle();
        ProtoParsers.j(bundle, "clusterKey", etubVar);
        edoi edoiVar = new edoi();
        edoiVar.at(bundle);
        return edoiVar;
    }
}
