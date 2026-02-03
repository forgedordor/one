package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esfb implements eset {
    public static final eser a;
    public static final eser b;
    private static final Charset d = Charset.forName("UTF-8");
    private static final eses e;
    public final Map c;
    private OutputStream f;
    private final Map g;
    private final eses h;
    private final esff i = new esff();

    static {
        eseq eseqVar = new eseq("key");
        eseqVar.b(new esev(1, esey.DEFAULT));
        a = eseqVar.a();
        eseq eseqVar2 = new eseq(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE);
        eseqVar2.b(new esev(2, esey.DEFAULT));
        b = eseqVar2.a();
        e = new eses() { // from class: esfa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eseo
            public final void a(Object obj, Object obj2) {
                Map.Entry entry = (Map.Entry) obj;
                obj2.b(esfb.a, entry.getKey());
                obj2.b(esfb.b, entry.getValue());
            }
        };
    }

    public esfb(OutputStream outputStream, Map map, Map map2, eses esesVar) {
        this.f = outputStream;
        this.c = map;
        this.g = map2;
        this.h = esesVar;
    }

    private static int g(eser eserVar) {
        esez esezVar = (esez) eserVar.a(esez.class);
        if (esezVar != null) {
            return esezVar.a();
        }
        throw new esep("Field has no @Protobuf config");
    }

    private static esez h(eser eserVar) {
        esez esezVar = (esez) eserVar.a(esez.class);
        if (esezVar != null) {
            return esezVar;
        }
        throw new esep("Field has no @Protobuf config");
    }

    private static ByteBuffer i(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void j(int i) throws IOException {
        while (true) {
            int i2 = i & 127;
            if ((i & (-128)) == 0) {
                this.f.write(i2);
                return;
            } else {
                this.f.write(i2 | 128);
                i >>>= 7;
            }
        }
    }

    private final void k(long j) throws IOException {
        while (true) {
            int i = ((int) j) & 127;
            if (((-128) & j) == 0) {
                this.f.write(i);
                return;
            } else {
                this.f.write(i | 128);
                j >>>= 7;
            }
        }
    }

    private final void l(eses esesVar, eser eserVar, Object obj, boolean z) throws IOException {
        esew esewVar = new esew();
        try {
            OutputStream outputStream = this.f;
            this.f = esewVar;
            try {
                esesVar.a(obj, this);
                this.f = outputStream;
                long j = esewVar.a;
                esewVar.close();
                if (z && j == 0) {
                    return;
                }
                j((g(eserVar) << 3) | 2);
                k(j);
                esesVar.a(obj, this);
            } catch (Throwable th) {
                this.f = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                esewVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.eset
    public final /* bridge */ /* synthetic */ void a(eser eserVar, long j) throws IOException {
        d(eserVar, j, true);
    }

    @Override // defpackage.eset
    public final void b(eser eserVar, Object obj) throws IOException {
        f(eserVar, obj, true);
    }

    final void c(eser eserVar, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return;
        }
        esez esezVarH = h(eserVar);
        int iOrdinal = esezVarH.b().ordinal();
        if (iOrdinal == 0) {
            j(esezVarH.a() << 3);
            j(i);
        } else if (iOrdinal == 1) {
            j(esezVarH.a() << 3);
            j((i + i) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            j((esezVarH.a() << 3) | 5);
            this.f.write(i(4).putInt(i).array());
        }
    }

    final void d(eser eserVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        esez esezVarH = h(eserVar);
        int iOrdinal = esezVarH.b().ordinal();
        if (iOrdinal == 0) {
            j(esezVarH.a() << 3);
            k(j);
        } else if (iOrdinal == 1) {
            j(esezVarH.a() << 3);
            k((j >> 63) ^ (j + j));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            j((esezVarH.a() << 3) | 1);
            this.f.write(i(8).putLong(j).array());
        }
    }

    public final void e(eser eserVar, int i) {
        c(eserVar, i, true);
    }

    final void f(eser eserVar, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            j((g(eserVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(d);
            j(bytes.length);
            this.f.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(eserVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                l(e, eserVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            j((g(eserVar) << 3) | 1);
            this.f.write(i(8).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            j((g(eserVar) << 3) | 5);
            this.f.write(i(4).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            d(eserVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            c(eserVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            j((g(eserVar) << 3) | 2);
            j(bArr.length);
            this.f.write(bArr);
            return;
        }
        eses esesVar = (eses) this.c.get(obj.getClass());
        if (esesVar != null) {
            l(esesVar, eserVar, obj, z);
            return;
        }
        eseu eseuVar = (eseu) this.g.get(obj.getClass());
        if (eseuVar != null) {
            eseuVar.a(obj, this.i);
            return;
        }
        if (obj instanceof esex) {
            e(eserVar, ((esex) obj).a());
        } else if (obj instanceof Enum) {
            e(eserVar, ((Enum) obj).ordinal());
        } else {
            l(this.h, eserVar, obj, z);
        }
    }
}
