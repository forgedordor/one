package defpackage;

import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import org.w3c.dom.DOMException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpv {
    private final dhdy a;

    public dfpv(dhdy dhdyVar) {
        this.a = dhdyVar;
    }

    public final byte[] a(String str, LocationInformation locationInformation) throws XmlPullParserException, IllegalStateException, DOMException, IOException, IllegalArgumentException {
        String str2 = locationInformation.a;
        double d = locationInformation.d;
        double d2 = locationInformation.c;
        double d3 = locationInformation.e;
        long j = locationInformation.f;
        dhdx dhdxVar = (dhdx) this.a.a.b();
        dhdxVar.b = str;
        dhdxVar.a().a().a().a().add(new dhmk(new dhna(Double.valueOf(d), Double.valueOf(d2)), Double.valueOf(d3)));
        dhdxVar.a().a().a.d = new Date(j);
        if (!dhim.d(str2)) {
            dhdxVar.a().b = str2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        dhdy.b(dhdxVar, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
