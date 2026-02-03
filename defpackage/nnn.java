package defpackage;

import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnn implements nnw {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final nnm c = new nnm(new nnl() { // from class: nnj
        @Override // defpackage.nnl
        public final Constructor a() {
            int i = nnn.a;
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(nnr.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final nnm d = new nnm(new nnl() { // from class: nnk
        @Override // defpackage.nnl
        public final Constructor a() {
            int i = nnn.a;
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(nnr.class).getConstructor(null);
        }
    });
    private ekgb e;
    private int h;
    private nvl g = new nuw();
    private boolean f = true;

    private final void e(int i, List list) {
        switch (i) {
            case 0:
                list.add(new nxw());
                break;
            case 1:
                list.add(new nxy());
                break;
            case 2:
                list.add(new nya(null));
                break;
            case 3:
                list.add(new npe(null));
                break;
            case 4:
                nnr nnrVarA = c.a(0);
                if (nnrVarA == null) {
                    list.add(new npu(null));
                    break;
                } else {
                    list.add(nnrVarA);
                    break;
                }
            case 5:
                list.add(new npw());
                break;
            case 6:
                list.add(new nsg(new nsd(), true != this.f ? 2 : 0, this.g));
                break;
            case 7:
                list.add(new nsm(null));
                break;
            case 8:
                nvl nvlVar = this.g;
                int i2 = true != this.f ? 32 : 0;
                int i3 = ekgb.d;
                list.add(new ntj(nvlVar, i2, ekoe.a));
                list.add(new ntp(this.g, true != this.f ? 16 : 0));
                break;
            case 9:
                list.add(new nuf());
                break;
            case 10:
                list.add(new nzd());
                break;
            case 11:
                if (this.e == null) {
                    int i4 = ekgb.d;
                    this.e = ekoe.a;
                }
                list.add(new nzn(!this.f ? 1 : 0, this.g, new mfy(0L), new nyc(this.e)));
                break;
            case 12:
                list.add(new nzy());
                break;
            case 14:
                list.add(new nqc(this.h));
                break;
            case 15:
                nnr nnrVarA2 = d.a(new Object[0]);
                if (nnrVarA2 != null) {
                    list.add(nnrVarA2);
                    break;
                }
                break;
            case 16:
                list.add(new npi(!this.f ? 1 : 0, this.g));
                break;
            case 17:
                list.add(new nup());
                break;
            case 18:
                list.add(new oad());
                break;
            case 19:
                list.add(new npq());
                break;
            case 20:
                list.add(new nqb());
                break;
            case 21:
                list.add(new npp());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01fb A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:138:0x01fb, B:139:0x01fe, B:259:0x03c3, B:260:0x03c6, B:262:0x03cb, B:265:0x03d1, B:266:0x03d4, B:267:0x03d7, B:142:0x0207, B:144:0x020f, B:147:0x0219, B:150:0x0225, B:152:0x022d, B:155:0x0237, B:158:0x0242, B:161:0x024d, B:164:0x0258, B:166:0x0260, B:168:0x0268, B:171:0x0272, B:173:0x0280, B:176:0x028a, B:179:0x0295, B:181:0x029d, B:183:0x02ab, B:185:0x02b9, B:188:0x02c9, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02f9, B:202:0x0303, B:204:0x030b, B:207:0x031b, B:209:0x0323, B:212:0x032d, B:214:0x0335, B:217:0x033f, B:219:0x0347, B:222:0x0350, B:225:0x035c, B:228:0x0368, B:231:0x0374, B:233:0x037c, B:236:0x0385, B:238:0x038d, B:241:0x0396, B:14:0x0048, B:15:0x0050, B:114:0x01c1, B:17:0x0055, B:20:0x0061, B:23:0x006c, B:26:0x0078, B:29:0x0084, B:32:0x008f, B:35:0x009b, B:38:0x00a6, B:41:0x00b2, B:44:0x00be, B:47:0x00c9, B:50:0x00d5, B:53:0x00e0, B:56:0x00eb, B:59:0x00f6, B:62:0x0102, B:65:0x010d, B:68:0x0119, B:71:0x0125, B:74:0x0131, B:77:0x013d, B:80:0x0149, B:83:0x0155, B:86:0x0161, B:89:0x016c, B:92:0x0177, B:95:0x0182, B:98:0x018d, B:101:0x0198, B:104:0x01a2, B:107:0x01ac, B:110:0x01b6), top: B:273:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0207 A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:138:0x01fb, B:139:0x01fe, B:259:0x03c3, B:260:0x03c6, B:262:0x03cb, B:265:0x03d1, B:266:0x03d4, B:267:0x03d7, B:142:0x0207, B:144:0x020f, B:147:0x0219, B:150:0x0225, B:152:0x022d, B:155:0x0237, B:158:0x0242, B:161:0x024d, B:164:0x0258, B:166:0x0260, B:168:0x0268, B:171:0x0272, B:173:0x0280, B:176:0x028a, B:179:0x0295, B:181:0x029d, B:183:0x02ab, B:185:0x02b9, B:188:0x02c9, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02f9, B:202:0x0303, B:204:0x030b, B:207:0x031b, B:209:0x0323, B:212:0x032d, B:214:0x0335, B:217:0x033f, B:219:0x0347, B:222:0x0350, B:225:0x035c, B:228:0x0368, B:231:0x0374, B:233:0x037c, B:236:0x0385, B:238:0x038d, B:241:0x0396, B:14:0x0048, B:15:0x0050, B:114:0x01c1, B:17:0x0055, B:20:0x0061, B:23:0x006c, B:26:0x0078, B:29:0x0084, B:32:0x008f, B:35:0x009b, B:38:0x00a6, B:41:0x00b2, B:44:0x00be, B:47:0x00c9, B:50:0x00d5, B:53:0x00e0, B:56:0x00eb, B:59:0x00f6, B:62:0x0102, B:65:0x010d, B:68:0x0119, B:71:0x0125, B:74:0x0131, B:77:0x013d, B:80:0x0149, B:83:0x0155, B:86:0x0161, B:89:0x016c, B:92:0x0177, B:95:0x0182, B:98:0x018d, B:101:0x0198, B:104:0x01a2, B:107:0x01ac, B:110:0x01b6), top: B:273:0x0003 }] */
    @Override // defpackage.nnw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.nnr[] a(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnn.a(android.net.Uri, java.util.Map):nnr[]");
    }

    @Deprecated
    public final synchronized void b(boolean z) {
        this.f = z;
    }

    public final synchronized void c() {
        this.h = 1;
    }

    public final synchronized void d(nvl nvlVar) {
        this.g = nvlVar;
    }
}
