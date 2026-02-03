package defpackage;

import android.content.Context;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient;
import com.google.android.gms.wearable.internal.ChannelImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depy extends ChannelClient {
    public depy(Context context, dcfl dcflVar) {
        super(context, dcflVar);
    }

    public static void b(Channel channel) {
        dclh.n(channel, "channel must not be null");
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final defn a(ChannelClient.Channel channel) {
        dclh.n(channel, "channel must not be null");
        dcfq dcfqVar = this.k;
        deqb deqbVar = new deqb((ChannelImpl) channel, dcfqVar);
        dcfqVar.b(deqbVar);
        return dclg.a(deqbVar, new dclf() { // from class: depw
            @Override // defpackage.dclf
            public final Object a(dcfx dcfxVar) {
                return ((deqc) dcfxVar).a;
            }
        });
    }
}
