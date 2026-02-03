package defpackage;

import android.os.Bundle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euix {
    public final String a;
    public final float b;
    public final Bundle c;
    public final int d;
    public final int e;

    public euix(String str, Float f, int i, int i2, Bundle bundle) {
        str.getClass();
        this.a = str;
        f.getClass();
        this.b = f.floatValue();
        this.c = bundle;
        this.d = i;
        this.e = i2;
    }

    public final ekgb a() {
        byte[] byteArray = this.c.getByteArray("textclassifier.extras.EXTRA_SERIALIZED_ENTITY_DATA");
        ekfw ekfwVar = new ekfw();
        if (byteArray != null) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArray);
            febq febqVar = new febq();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            febqVar.h(byteBufferWrap.getInt(byteBufferWrap.position()) + byteBufferWrap.position(), byteBufferWrap);
            febr febrVar = new febr();
            int iD = febqVar.d(10);
            if (iD != 0) {
                febrVar.h(febqVar.c(iD + febqVar.a), febqVar.b);
            } else {
                febrVar = null;
            }
            if (febrVar != null) {
                int i = 0;
                while (true) {
                    int iD2 = febrVar.d(8);
                    if (i >= (iD2 != 0 ? febrVar.f(iD2) : 0)) {
                        break;
                    }
                    febs febsVarA = febrVar.a(i);
                    int iD3 = febsVarA.d(4);
                    int i2 = iD3 != 0 ? febsVarA.b.getInt(iD3 + febsVarA.a) : 0;
                    ekgp ekgpVar = euil.m;
                    Integer numValueOf = Integer.valueOf(i2);
                    ejwl.d(ekgpVar.containsKey(numValueOf), "Unknown datetime component type value: %s", i2);
                    euil euilVar = (euil) ekgpVar.get(numValueOf);
                    febs febsVarA2 = febrVar.a(i);
                    int iD4 = febsVarA2.d(10);
                    int i3 = iD4 != 0 ? febsVarA2.b.getInt(iD4 + febsVarA2.a) : 0;
                    ekgp ekgpVar2 = euim.d;
                    Integer numValueOf2 = Integer.valueOf(i3);
                    ejwl.d(ekgpVar2.containsKey(numValueOf2), "Unknown datetime relation type value: %s", i3);
                    euim euimVar = (euim) ekgpVar2.get(numValueOf2);
                    febs febsVarA3 = febrVar.a(i);
                    int iD5 = febsVarA3.d(6);
                    int i4 = iD5 != 0 ? febsVarA3.b.getInt(iD5 + febsVarA3.a) : 0;
                    febs febsVarA4 = febrVar.a(i);
                    int iD6 = febsVarA4.d(8);
                    ekfwVar.h(new euin(euilVar, euimVar, i4, iD6 != 0 ? febsVarA4.b.getInt(iD6 + febsVarA4.a) : 0));
                    i++;
                }
            }
        }
        return ekfwVar.g();
    }

    public final euio b() {
        Bundle bundle = this.c;
        if (bundle.containsKey("textclassifier.extras.DATETIME_GRANULARITY")) {
            return euio.a(bundle.getInt("textclassifier.extras.DATETIME_GRANULARITY"));
        }
        return null;
    }

    public final String toString() {
        return String.format(Locale.US, "Entity {type=%s, score=%s, start=%s, end=%s, extras=%s}", this.a, Float.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.e), this.c);
    }
}
