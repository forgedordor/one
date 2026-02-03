package defpackage;

import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.StringDecoder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fewv {
    public static fewv a;

    static {
        try {
            a = (fewv) Class.forName(fews.a("net.fortuna.ical4j.factory.decoder")).newInstance();
        } catch (Exception unused) {
            a = new feww();
        }
    }

    public abstract BinaryDecoder a(feti fetiVar);

    public abstract StringDecoder b(feti fetiVar);
}
