package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxxc implements dxjt {
    private final esmw a;

    public dxxc(esmw esmwVar) {
        this.a = esmwVar;
    }

    @Override // defpackage.dxjt
    public final ListenableFuture a(dxjx dxjxVar) {
        esnn esnnVar = new esnn();
        dxjq dxjqVar = (dxjq) dxjxVar;
        esnnVar.e(dxjqVar.a.toString());
        for (Map.Entry entry : dxjqVar.c.entrySet()) {
            for (String str : (List) entry.getValue()) {
                esnm esnmVarB = esnm.b(((dxju) entry.getKey()).a());
                str.getClass();
                esnnVar.b.t(esnmVarB, str);
            }
        }
        byte[] bArr = dxjqVar.d;
        if (bArr != null) {
            esnnVar.d(dxjqVar.b, (ByteBuffer) ByteBuffer.allocateDirect(bArr.length).put(bArr).position(0));
            esnnVar.c("POST");
        } else {
            esnnVar.c("GET");
        }
        return eooq.f(this.a.a(esnnVar.a()), eiid.a(new ejvr() { // from class: dxxb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                byte[] bArrCopyOfRange;
                esnv esnvVar = (esnv) obj;
                dxjr dxjrVar = new dxjr();
                dxjrVar.b = new HashMap();
                dxjrVar.f = true;
                dxjrVar.a = Integer.valueOf(esnvVar.c);
                ByteBuffer byteBuffer = esnvVar.b;
                if (byteBuffer == null) {
                    bArrCopyOfRange = new byte[0];
                } else if (byteBuffer.hasArray()) {
                    int iArrayOffset = byteBuffer.arrayOffset();
                    if (iArrayOffset != 0) {
                        bArrCopyOfRange = Arrays.copyOfRange(byteBuffer.array(), iArrayOffset, byteBuffer.limit() + iArrayOffset);
                    } else if (byteBuffer.array().length == byteBuffer.limit()) {
                        bArrCopyOfRange = byteBuffer.array();
                    } else {
                        iArrayOffset = 0;
                        bArrCopyOfRange = Arrays.copyOfRange(byteBuffer.array(), iArrayOffset, byteBuffer.limit() + iArrayOffset);
                    }
                } else {
                    byte[] bArr2 = new byte[byteBuffer.limit()];
                    int iPosition = byteBuffer.position();
                    byteBuffer.position(0);
                    byteBuffer.get(bArr2);
                    byteBuffer.position(iPosition);
                    bArrCopyOfRange = bArr2;
                }
                dxjrVar.c = bArrCopyOfRange;
                ekjo ekjoVar = esnvVar.a;
                ekgi ekgiVar = new ekgi();
                for (Map.Entry entry2 : ekjoVar.w().entrySet()) {
                    ekgiVar.i(dxju.b(((esnm) entry2.getKey()).a()), (List) entry2.getValue());
                }
                dxjrVar.a().putAll(ekgiVar.c());
                if (dxjrVar.f) {
                    dxjrVar.d = dxjrVar.c;
                } else {
                    try {
                        Map mapA = dxjrVar.a();
                        byte[] bArrB = dxjrVar.c;
                        dxju dxjuVar = dxju.a;
                        if (mapA.containsKey(dxjuVar)) {
                            List list = (List) mapA.get(dxjuVar);
                            if (!list.isEmpty() && ejuf.e((CharSequence) list.get(0), "gzip")) {
                                bArrB = elec.b(new GZIPInputStream(new ByteArrayInputStream(bArrB)));
                            }
                        }
                        dxjrVar.d = bArrB;
                    } catch (IOException e) {
                        dxjrVar.e = e;
                    }
                }
                Map map = dxjrVar.b;
                if (map != null) {
                    return new dxjs(dxjrVar.a, map, dxjrVar.c, dxjrVar.d, dxjrVar.e);
                }
                throw new IllegalStateException("Missing required properties: headers");
            }
        }), eoqg.a);
    }

    @Override // defpackage.dxjt
    public final String b() {
        return "tiktok";
    }
}
