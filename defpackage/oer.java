package defpackage;

import android.content.Context;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oer {
    public final Context a;
    public final oay b;
    public final boolean c;
    public final oat d;
    public final oen e;
    public final mew f;
    public final List g;
    public final Object h;
    public final oem i;
    public final List j;
    public final odh k;
    public final mem l;
    public final Object m;
    public final Object n;
    public final odj o;
    public final Object p;
    public final ekgb q;
    public boolean r;
    public long s;
    public int t;
    public RuntimeException u;
    public int v;
    public int w;
    public boolean x;
    private final mew y;
    private final HandlerThread z;

    /* JADX WARN: Multi-variable type inference failed */
    public oer(Context context, oay oayVar, odx odxVar, oaj oajVar, oba obaVar, mcy mcyVar, oav oavVar, ekgb ekgbVar, odh odhVar, oen oenVar, ocv ocvVar, mew mewVar, maj majVar, mej mejVar, LogSessionId logSessionId) {
        oay oayVar2 = oayVar;
        this.a = context;
        this.b = oayVar2;
        this.d = new oat(oavVar);
        this.q = ekgbVar;
        this.e = oenVar;
        this.y = mewVar;
        this.k = odhVar;
        Log.i("TransformerInternal", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.1] [" + mgb.a + "]");
        HandlerThread handlerThread = new HandlerThread("Transformer:Internal");
        this.z = handlerThread;
        handlerThread.start();
        this.g = new ArrayList();
        Looper looper = handlerThread.getLooper();
        this.h = new Object();
        this.i = new oem(oayVar2);
        int i = 0;
        while (i < oayVar2.a.size()) {
            oeq oeqVar = new oeq(this, i, oayVar2, odxVar, obaVar, mcyVar, ocvVar, majVar, logSessionId);
            int i2 = i;
            oay oayVar3 = oayVar2;
            obv obvVar = (obv) oayVar3.a.get(i2);
            this.g.add(new odu(obvVar, oajVar, new oai(odxVar.d, oayVar3.e), oeqVar, mejVar, looper));
            boolean z = obvVar.b;
            this.t++;
            i = i2 + 1;
            oayVar2 = oayVar3;
        }
        this.c = this.t != oayVar2.a.size();
        this.m = new Object();
        this.l = new mem();
        this.n = new Object();
        this.o = new odj();
        this.p = new Object();
        this.j = new ArrayList();
        this.f = mejVar.b(looper, new Handler.Callback() { // from class: oeh
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:119:0x01f4 A[Catch: ode -> 0x025f, oah -> 0x026a, ocp -> 0x0698, RuntimeException -> 0x06b3, TryCatch #4 {RuntimeException -> 0x06b3, blocks: (B:8:0x0012, B:15:0x001f, B:18:0x002a, B:20:0x0032, B:22:0x003c, B:316:0x05f2, B:318:0x05f8, B:322:0x060a, B:25:0x0046, B:27:0x004a, B:28:0x0056, B:30:0x0060, B:32:0x006a, B:33:0x0077, B:39:0x0086, B:41:0x0095, B:43:0x00a9, B:47:0x00b0, B:51:0x00c0, B:53:0x00d7, B:54:0x00db, B:55:0x00e0, B:57:0x00ec, B:58:0x00f3, B:59:0x00f4, B:61:0x0107, B:63:0x011c, B:65:0x0122, B:67:0x012d, B:113:0x01ca, B:68:0x013e, B:72:0x014b, B:120:0x0203, B:122:0x0210, B:125:0x021d, B:127:0x0223, B:129:0x0231, B:130:0x023e, B:131:0x0241, B:133:0x0247, B:135:0x024b, B:138:0x024f, B:139:0x025e, B:117:0x01db, B:118:0x01f3, B:119:0x01f4, B:141:0x0260, B:142:0x0269, B:144:0x026b, B:145:0x0274, B:146:0x0275, B:148:0x027d, B:150:0x0285, B:152:0x028d, B:154:0x02ba, B:156:0x02c2, B:159:0x02c9, B:162:0x02db, B:164:0x02e0, B:171:0x02fc, B:178:0x030f, B:179:0x0314, B:187:0x0327, B:218:0x0382, B:220:0x038f, B:221:0x0392, B:223:0x039f, B:233:0x03bf, B:237:0x03d0, B:190:0x0330, B:197:0x0347, B:201:0x0355, B:208:0x0369, B:209:0x036e, B:216:0x037c, B:238:0x03f2, B:240:0x0400, B:257:0x0467, B:259:0x046c, B:261:0x0472, B:267:0x047c, B:271:0x0483, B:273:0x0489, B:277:0x0492, B:279:0x049f, B:280:0x04a1, B:282:0x04c6, B:284:0x04d2, B:286:0x04f1, B:290:0x04fb, B:291:0x0508, B:292:0x050e, B:294:0x052d, B:296:0x0540, B:303:0x0579, B:307:0x05bf, B:308:0x05c1, B:311:0x05c6, B:312:0x05e6, B:283:0x04cd, B:243:0x0424, B:246:0x042d, B:248:0x043d, B:251:0x044f, B:253:0x0453, B:254:0x045e, B:314:0x05e8, B:315:0x05f1, B:323:0x0615, B:345:0x0663, B:347:0x0669, B:327:0x061d, B:329:0x0625, B:331:0x0643, B:332:0x0645, B:338:0x064f, B:339:0x0650, B:340:0x0659, B:341:0x065b, B:354:0x067d, B:355:0x067e, B:357:0x068b, B:364:0x069c, B:366:0x06a4), top: B:381:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:124:0x021c  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x0247 A[Catch: ode -> 0x025f, oah -> 0x026a, ocp -> 0x0698, RuntimeException -> 0x06b3, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x06b3, blocks: (B:8:0x0012, B:15:0x001f, B:18:0x002a, B:20:0x0032, B:22:0x003c, B:316:0x05f2, B:318:0x05f8, B:322:0x060a, B:25:0x0046, B:27:0x004a, B:28:0x0056, B:30:0x0060, B:32:0x006a, B:33:0x0077, B:39:0x0086, B:41:0x0095, B:43:0x00a9, B:47:0x00b0, B:51:0x00c0, B:53:0x00d7, B:54:0x00db, B:55:0x00e0, B:57:0x00ec, B:58:0x00f3, B:59:0x00f4, B:61:0x0107, B:63:0x011c, B:65:0x0122, B:67:0x012d, B:113:0x01ca, B:68:0x013e, B:72:0x014b, B:120:0x0203, B:122:0x0210, B:125:0x021d, B:127:0x0223, B:129:0x0231, B:130:0x023e, B:131:0x0241, B:133:0x0247, B:135:0x024b, B:138:0x024f, B:139:0x025e, B:117:0x01db, B:118:0x01f3, B:119:0x01f4, B:141:0x0260, B:142:0x0269, B:144:0x026b, B:145:0x0274, B:146:0x0275, B:148:0x027d, B:150:0x0285, B:152:0x028d, B:154:0x02ba, B:156:0x02c2, B:159:0x02c9, B:162:0x02db, B:164:0x02e0, B:171:0x02fc, B:178:0x030f, B:179:0x0314, B:187:0x0327, B:218:0x0382, B:220:0x038f, B:221:0x0392, B:223:0x039f, B:233:0x03bf, B:237:0x03d0, B:190:0x0330, B:197:0x0347, B:201:0x0355, B:208:0x0369, B:209:0x036e, B:216:0x037c, B:238:0x03f2, B:240:0x0400, B:257:0x0467, B:259:0x046c, B:261:0x0472, B:267:0x047c, B:271:0x0483, B:273:0x0489, B:277:0x0492, B:279:0x049f, B:280:0x04a1, B:282:0x04c6, B:284:0x04d2, B:286:0x04f1, B:290:0x04fb, B:291:0x0508, B:292:0x050e, B:294:0x052d, B:296:0x0540, B:303:0x0579, B:307:0x05bf, B:308:0x05c1, B:311:0x05c6, B:312:0x05e6, B:283:0x04cd, B:243:0x0424, B:246:0x042d, B:248:0x043d, B:251:0x044f, B:253:0x0453, B:254:0x045e, B:314:0x05e8, B:315:0x05f1, B:323:0x0615, B:345:0x0663, B:347:0x0669, B:327:0x061d, B:329:0x0625, B:331:0x0643, B:332:0x0645, B:338:0x064f, B:339:0x0650, B:340:0x0659, B:341:0x065b, B:354:0x067d, B:355:0x067e, B:357:0x068b, B:364:0x069c, B:366:0x06a4), top: B:381:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:148:0x027d A[Catch: ocp -> 0x0698, RuntimeException -> 0x06b3, TryCatch #4 {RuntimeException -> 0x06b3, blocks: (B:8:0x0012, B:15:0x001f, B:18:0x002a, B:20:0x0032, B:22:0x003c, B:316:0x05f2, B:318:0x05f8, B:322:0x060a, B:25:0x0046, B:27:0x004a, B:28:0x0056, B:30:0x0060, B:32:0x006a, B:33:0x0077, B:39:0x0086, B:41:0x0095, B:43:0x00a9, B:47:0x00b0, B:51:0x00c0, B:53:0x00d7, B:54:0x00db, B:55:0x00e0, B:57:0x00ec, B:58:0x00f3, B:59:0x00f4, B:61:0x0107, B:63:0x011c, B:65:0x0122, B:67:0x012d, B:113:0x01ca, B:68:0x013e, B:72:0x014b, B:120:0x0203, B:122:0x0210, B:125:0x021d, B:127:0x0223, B:129:0x0231, B:130:0x023e, B:131:0x0241, B:133:0x0247, B:135:0x024b, B:138:0x024f, B:139:0x025e, B:117:0x01db, B:118:0x01f3, B:119:0x01f4, B:141:0x0260, B:142:0x0269, B:144:0x026b, B:145:0x0274, B:146:0x0275, B:148:0x027d, B:150:0x0285, B:152:0x028d, B:154:0x02ba, B:156:0x02c2, B:159:0x02c9, B:162:0x02db, B:164:0x02e0, B:171:0x02fc, B:178:0x030f, B:179:0x0314, B:187:0x0327, B:218:0x0382, B:220:0x038f, B:221:0x0392, B:223:0x039f, B:233:0x03bf, B:237:0x03d0, B:190:0x0330, B:197:0x0347, B:201:0x0355, B:208:0x0369, B:209:0x036e, B:216:0x037c, B:238:0x03f2, B:240:0x0400, B:257:0x0467, B:259:0x046c, B:261:0x0472, B:267:0x047c, B:271:0x0483, B:273:0x0489, B:277:0x0492, B:279:0x049f, B:280:0x04a1, B:282:0x04c6, B:284:0x04d2, B:286:0x04f1, B:290:0x04fb, B:291:0x0508, B:292:0x050e, B:294:0x052d, B:296:0x0540, B:303:0x0579, B:307:0x05bf, B:308:0x05c1, B:311:0x05c6, B:312:0x05e6, B:283:0x04cd, B:243:0x0424, B:246:0x042d, B:248:0x043d, B:251:0x044f, B:253:0x0453, B:254:0x045e, B:314:0x05e8, B:315:0x05f1, B:323:0x0615, B:345:0x0663, B:347:0x0669, B:327:0x061d, B:329:0x0625, B:331:0x0643, B:332:0x0645, B:338:0x064f, B:339:0x0650, B:340:0x0659, B:341:0x065b, B:354:0x067d, B:355:0x067e, B:357:0x068b, B:364:0x069c, B:366:0x06a4), top: B:381:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:164:0x02e0 A[Catch: ocp -> 0x0698, RuntimeException -> 0x06b3, TryCatch #4 {RuntimeException -> 0x06b3, blocks: (B:8:0x0012, B:15:0x001f, B:18:0x002a, B:20:0x0032, B:22:0x003c, B:316:0x05f2, B:318:0x05f8, B:322:0x060a, B:25:0x0046, B:27:0x004a, B:28:0x0056, B:30:0x0060, B:32:0x006a, B:33:0x0077, B:39:0x0086, B:41:0x0095, B:43:0x00a9, B:47:0x00b0, B:51:0x00c0, B:53:0x00d7, B:54:0x00db, B:55:0x00e0, B:57:0x00ec, B:58:0x00f3, B:59:0x00f4, B:61:0x0107, B:63:0x011c, B:65:0x0122, B:67:0x012d, B:113:0x01ca, B:68:0x013e, B:72:0x014b, B:120:0x0203, B:122:0x0210, B:125:0x021d, B:127:0x0223, B:129:0x0231, B:130:0x023e, B:131:0x0241, B:133:0x0247, B:135:0x024b, B:138:0x024f, B:139:0x025e, B:117:0x01db, B:118:0x01f3, B:119:0x01f4, B:141:0x0260, B:142:0x0269, B:144:0x026b, B:145:0x0274, B:146:0x0275, B:148:0x027d, B:150:0x0285, B:152:0x028d, B:154:0x02ba, B:156:0x02c2, B:159:0x02c9, B:162:0x02db, B:164:0x02e0, B:171:0x02fc, B:178:0x030f, B:179:0x0314, B:187:0x0327, B:218:0x0382, B:220:0x038f, B:221:0x0392, B:223:0x039f, B:233:0x03bf, B:237:0x03d0, B:190:0x0330, B:197:0x0347, B:201:0x0355, B:208:0x0369, B:209:0x036e, B:216:0x037c, B:238:0x03f2, B:240:0x0400, B:257:0x0467, B:259:0x046c, B:261:0x0472, B:267:0x047c, B:271:0x0483, B:273:0x0489, B:277:0x0492, B:279:0x049f, B:280:0x04a1, B:282:0x04c6, B:284:0x04d2, B:286:0x04f1, B:290:0x04fb, B:291:0x0508, B:292:0x050e, B:294:0x052d, B:296:0x0540, B:303:0x0579, B:307:0x05bf, B:308:0x05c1, B:311:0x05c6, B:312:0x05e6, B:283:0x04cd, B:243:0x0424, B:246:0x042d, B:248:0x043d, B:251:0x044f, B:253:0x0453, B:254:0x045e, B:314:0x05e8, B:315:0x05f1, B:323:0x0615, B:345:0x0663, B:347:0x0669, B:327:0x061d, B:329:0x0625, B:331:0x0643, B:332:0x0645, B:338:0x064f, B:339:0x0650, B:340:0x0659, B:341:0x065b, B:354:0x067d, B:355:0x067e, B:357:0x068b, B:364:0x069c, B:366:0x06a4), top: B:381:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:188:0x032d  */
            /* JADX WARN: Removed duplicated region for block: B:199:0x0352  */
            /* JADX WARN: Removed duplicated region for block: B:200:0x0354  */
            /* JADX WARN: Removed duplicated region for block: B:203:0x035f  */
            /* JADX WARN: Removed duplicated region for block: B:211:0x0373  */
            /* JADX WARN: Removed duplicated region for block: B:220:0x038f A[Catch: ocp -> 0x0698, RuntimeException -> 0x06b3, TryCatch #4 {RuntimeException -> 0x06b3, blocks: (B:8:0x0012, B:15:0x001f, B:18:0x002a, B:20:0x0032, B:22:0x003c, B:316:0x05f2, B:318:0x05f8, B:322:0x060a, B:25:0x0046, B:27:0x004a, B:28:0x0056, B:30:0x0060, B:32:0x006a, B:33:0x0077, B:39:0x0086, B:41:0x0095, B:43:0x00a9, B:47:0x00b0, B:51:0x00c0, B:53:0x00d7, B:54:0x00db, B:55:0x00e0, B:57:0x00ec, B:58:0x00f3, B:59:0x00f4, B:61:0x0107, B:63:0x011c, B:65:0x0122, B:67:0x012d, B:113:0x01ca, B:68:0x013e, B:72:0x014b, B:120:0x0203, B:122:0x0210, B:125:0x021d, B:127:0x0223, B:129:0x0231, B:130:0x023e, B:131:0x0241, B:133:0x0247, B:135:0x024b, B:138:0x024f, B:139:0x025e, B:117:0x01db, B:118:0x01f3, B:119:0x01f4, B:141:0x0260, B:142:0x0269, B:144:0x026b, B:145:0x0274, B:146:0x0275, B:148:0x027d, B:150:0x0285, B:152:0x028d, B:154:0x02ba, B:156:0x02c2, B:159:0x02c9, B:162:0x02db, B:164:0x02e0, B:171:0x02fc, B:178:0x030f, B:179:0x0314, B:187:0x0327, B:218:0x0382, B:220:0x038f, B:221:0x0392, B:223:0x039f, B:233:0x03bf, B:237:0x03d0, B:190:0x0330, B:197:0x0347, B:201:0x0355, B:208:0x0369, B:209:0x036e, B:216:0x037c, B:238:0x03f2, B:240:0x0400, B:257:0x0467, B:259:0x046c, B:261:0x0472, B:267:0x047c, B:271:0x0483, B:273:0x0489, B:277:0x0492, B:279:0x049f, B:280:0x04a1, B:282:0x04c6, B:284:0x04d2, B:286:0x04f1, B:290:0x04fb, B:291:0x0508, B:292:0x050e, B:294:0x052d, B:296:0x0540, B:303:0x0579, B:307:0x05bf, B:308:0x05c1, B:311:0x05c6, B:312:0x05e6, B:283:0x04cd, B:243:0x0424, B:246:0x042d, B:248:0x043d, B:251:0x044f, B:253:0x0453, B:254:0x045e, B:314:0x05e8, B:315:0x05f1, B:323:0x0615, B:345:0x0663, B:347:0x0669, B:327:0x061d, B:329:0x0625, B:331:0x0643, B:332:0x0645, B:338:0x064f, B:339:0x0650, B:340:0x0659, B:341:0x065b, B:354:0x067d, B:355:0x067e, B:357:0x068b, B:364:0x069c, B:366:0x06a4), top: B:381:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:223:0x039f A[Catch: ocp -> 0x0698, RuntimeException -> 0x06b3, TryCatch #4 {RuntimeException -> 0x06b3, blocks: (B:8:0x0012, B:15:0x001f, B:18:0x002a, B:20:0x0032, B:22:0x003c, B:316:0x05f2, B:318:0x05f8, B:322:0x060a, B:25:0x0046, B:27:0x004a, B:28:0x0056, B:30:0x0060, B:32:0x006a, B:33:0x0077, B:39:0x0086, B:41:0x0095, B:43:0x00a9, B:47:0x00b0, B:51:0x00c0, B:53:0x00d7, B:54:0x00db, B:55:0x00e0, B:57:0x00ec, B:58:0x00f3, B:59:0x00f4, B:61:0x0107, B:63:0x011c, B:65:0x0122, B:67:0x012d, B:113:0x01ca, B:68:0x013e, B:72:0x014b, B:120:0x0203, B:122:0x0210, B:125:0x021d, B:127:0x0223, B:129:0x0231, B:130:0x023e, B:131:0x0241, B:133:0x0247, B:135:0x024b, B:138:0x024f, B:139:0x025e, B:117:0x01db, B:118:0x01f3, B:119:0x01f4, B:141:0x0260, B:142:0x0269, B:144:0x026b, B:145:0x0274, B:146:0x0275, B:148:0x027d, B:150:0x0285, B:152:0x028d, B:154:0x02ba, B:156:0x02c2, B:159:0x02c9, B:162:0x02db, B:164:0x02e0, B:171:0x02fc, B:178:0x030f, B:179:0x0314, B:187:0x0327, B:218:0x0382, B:220:0x038f, B:221:0x0392, B:223:0x039f, B:233:0x03bf, B:237:0x03d0, B:190:0x0330, B:197:0x0347, B:201:0x0355, B:208:0x0369, B:209:0x036e, B:216:0x037c, B:238:0x03f2, B:240:0x0400, B:257:0x0467, B:259:0x046c, B:261:0x0472, B:267:0x047c, B:271:0x0483, B:273:0x0489, B:277:0x0492, B:279:0x049f, B:280:0x04a1, B:282:0x04c6, B:284:0x04d2, B:286:0x04f1, B:290:0x04fb, B:291:0x0508, B:292:0x050e, B:294:0x052d, B:296:0x0540, B:303:0x0579, B:307:0x05bf, B:308:0x05c1, B:311:0x05c6, B:312:0x05e6, B:283:0x04cd, B:243:0x0424, B:246:0x042d, B:248:0x043d, B:251:0x044f, B:253:0x0453, B:254:0x045e, B:314:0x05e8, B:315:0x05f1, B:323:0x0615, B:345:0x0663, B:347:0x0669, B:327:0x061d, B:329:0x0625, B:331:0x0643, B:332:0x0645, B:338:0x064f, B:339:0x0650, B:340:0x0659, B:341:0x065b, B:354:0x067d, B:355:0x067e, B:357:0x068b, B:364:0x069c, B:366:0x06a4), top: B:381:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:235:0x03ce  */
            /* JADX WARN: Removed duplicated region for block: B:236:0x03cf  */
            /* JADX WARN: Removed duplicated region for block: B:238:0x03f2 A[Catch: ocp -> 0x0698, RuntimeException -> 0x06b3, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x06b3, blocks: (B:8:0x0012, B:15:0x001f, B:18:0x002a, B:20:0x0032, B:22:0x003c, B:316:0x05f2, B:318:0x05f8, B:322:0x060a, B:25:0x0046, B:27:0x004a, B:28:0x0056, B:30:0x0060, B:32:0x006a, B:33:0x0077, B:39:0x0086, B:41:0x0095, B:43:0x00a9, B:47:0x00b0, B:51:0x00c0, B:53:0x00d7, B:54:0x00db, B:55:0x00e0, B:57:0x00ec, B:58:0x00f3, B:59:0x00f4, B:61:0x0107, B:63:0x011c, B:65:0x0122, B:67:0x012d, B:113:0x01ca, B:68:0x013e, B:72:0x014b, B:120:0x0203, B:122:0x0210, B:125:0x021d, B:127:0x0223, B:129:0x0231, B:130:0x023e, B:131:0x0241, B:133:0x0247, B:135:0x024b, B:138:0x024f, B:139:0x025e, B:117:0x01db, B:118:0x01f3, B:119:0x01f4, B:141:0x0260, B:142:0x0269, B:144:0x026b, B:145:0x0274, B:146:0x0275, B:148:0x027d, B:150:0x0285, B:152:0x028d, B:154:0x02ba, B:156:0x02c2, B:159:0x02c9, B:162:0x02db, B:164:0x02e0, B:171:0x02fc, B:178:0x030f, B:179:0x0314, B:187:0x0327, B:218:0x0382, B:220:0x038f, B:221:0x0392, B:223:0x039f, B:233:0x03bf, B:237:0x03d0, B:190:0x0330, B:197:0x0347, B:201:0x0355, B:208:0x0369, B:209:0x036e, B:216:0x037c, B:238:0x03f2, B:240:0x0400, B:257:0x0467, B:259:0x046c, B:261:0x0472, B:267:0x047c, B:271:0x0483, B:273:0x0489, B:277:0x0492, B:279:0x049f, B:280:0x04a1, B:282:0x04c6, B:284:0x04d2, B:286:0x04f1, B:290:0x04fb, B:291:0x0508, B:292:0x050e, B:294:0x052d, B:296:0x0540, B:303:0x0579, B:307:0x05bf, B:308:0x05c1, B:311:0x05c6, B:312:0x05e6, B:283:0x04cd, B:243:0x0424, B:246:0x042d, B:248:0x043d, B:251:0x044f, B:253:0x0453, B:254:0x045e, B:314:0x05e8, B:315:0x05f1, B:323:0x0615, B:345:0x0663, B:347:0x0669, B:327:0x061d, B:329:0x0625, B:331:0x0643, B:332:0x0645, B:338:0x064f, B:339:0x0650, B:340:0x0659, B:341:0x065b, B:354:0x067d, B:355:0x067e, B:357:0x068b, B:364:0x069c, B:366:0x06a4), top: B:381:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:251:0x044f A[Catch: oah -> 0x05e7, ocp -> 0x0698, RuntimeException -> 0x06b3, TryCatch #0 {oah -> 0x05e7, blocks: (B:240:0x0400, B:257:0x0467, B:259:0x046c, B:261:0x0472, B:267:0x047c, B:271:0x0483, B:273:0x0489, B:277:0x0492, B:279:0x049f, B:280:0x04a1, B:282:0x04c6, B:284:0x04d2, B:286:0x04f1, B:290:0x04fb, B:291:0x0508, B:292:0x050e, B:294:0x052d, B:296:0x0540, B:303:0x0579, B:305:0x05b4, B:307:0x05bf, B:311:0x05c6, B:312:0x05e6, B:283:0x04cd, B:243:0x0424, B:246:0x042d, B:248:0x043d, B:251:0x044f, B:253:0x0453, B:254:0x045e), top: B:377:0x0400 }] */
            /* JADX WARN: Removed duplicated region for block: B:259:0x046c A[Catch: oah -> 0x05e7, ocp -> 0x0698, RuntimeException -> 0x06b3, TryCatch #0 {oah -> 0x05e7, blocks: (B:240:0x0400, B:257:0x0467, B:259:0x046c, B:261:0x0472, B:267:0x047c, B:271:0x0483, B:273:0x0489, B:277:0x0492, B:279:0x049f, B:280:0x04a1, B:282:0x04c6, B:284:0x04d2, B:286:0x04f1, B:290:0x04fb, B:291:0x0508, B:292:0x050e, B:294:0x052d, B:296:0x0540, B:303:0x0579, B:305:0x05b4, B:307:0x05bf, B:311:0x05c6, B:312:0x05e6, B:283:0x04cd, B:243:0x0424, B:246:0x042d, B:248:0x043d, B:251:0x044f, B:253:0x0453, B:254:0x045e), top: B:377:0x0400 }] */
            /* JADX WARN: Removed duplicated region for block: B:263:0x0476  */
            /* JADX WARN: Removed duplicated region for block: B:267:0x047c A[Catch: oah -> 0x05e7, ocp -> 0x0698, RuntimeException -> 0x06b3, TryCatch #0 {oah -> 0x05e7, blocks: (B:240:0x0400, B:257:0x0467, B:259:0x046c, B:261:0x0472, B:267:0x047c, B:271:0x0483, B:273:0x0489, B:277:0x0492, B:279:0x049f, B:280:0x04a1, B:282:0x04c6, B:284:0x04d2, B:286:0x04f1, B:290:0x04fb, B:291:0x0508, B:292:0x050e, B:294:0x052d, B:296:0x0540, B:303:0x0579, B:305:0x05b4, B:307:0x05bf, B:311:0x05c6, B:312:0x05e6, B:283:0x04cd, B:243:0x0424, B:246:0x042d, B:248:0x043d, B:251:0x044f, B:253:0x0453, B:254:0x045e), top: B:377:0x0400 }] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[Catch: ode -> 0x025f, oah -> 0x026a, RuntimeException -> 0x06b3, ocp -> 0x06c2, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x06b3, blocks: (B:8:0x0012, B:15:0x001f, B:18:0x002a, B:20:0x0032, B:22:0x003c, B:316:0x05f2, B:318:0x05f8, B:322:0x060a, B:25:0x0046, B:27:0x004a, B:28:0x0056, B:30:0x0060, B:32:0x006a, B:33:0x0077, B:39:0x0086, B:41:0x0095, B:43:0x00a9, B:47:0x00b0, B:51:0x00c0, B:53:0x00d7, B:54:0x00db, B:55:0x00e0, B:57:0x00ec, B:58:0x00f3, B:59:0x00f4, B:61:0x0107, B:63:0x011c, B:65:0x0122, B:67:0x012d, B:113:0x01ca, B:68:0x013e, B:72:0x014b, B:120:0x0203, B:122:0x0210, B:125:0x021d, B:127:0x0223, B:129:0x0231, B:130:0x023e, B:131:0x0241, B:133:0x0247, B:135:0x024b, B:138:0x024f, B:139:0x025e, B:117:0x01db, B:118:0x01f3, B:119:0x01f4, B:141:0x0260, B:142:0x0269, B:144:0x026b, B:145:0x0274, B:146:0x0275, B:148:0x027d, B:150:0x0285, B:152:0x028d, B:154:0x02ba, B:156:0x02c2, B:159:0x02c9, B:162:0x02db, B:164:0x02e0, B:171:0x02fc, B:178:0x030f, B:179:0x0314, B:187:0x0327, B:218:0x0382, B:220:0x038f, B:221:0x0392, B:223:0x039f, B:233:0x03bf, B:237:0x03d0, B:190:0x0330, B:197:0x0347, B:201:0x0355, B:208:0x0369, B:209:0x036e, B:216:0x037c, B:238:0x03f2, B:240:0x0400, B:257:0x0467, B:259:0x046c, B:261:0x0472, B:267:0x047c, B:271:0x0483, B:273:0x0489, B:277:0x0492, B:279:0x049f, B:280:0x04a1, B:282:0x04c6, B:284:0x04d2, B:286:0x04f1, B:290:0x04fb, B:291:0x0508, B:292:0x050e, B:294:0x052d, B:296:0x0540, B:303:0x0579, B:307:0x05bf, B:308:0x05c1, B:311:0x05c6, B:312:0x05e6, B:283:0x04cd, B:243:0x0424, B:246:0x042d, B:248:0x043d, B:251:0x044f, B:253:0x0453, B:254:0x045e, B:314:0x05e8, B:315:0x05f1, B:323:0x0615, B:345:0x0663, B:347:0x0669, B:327:0x061d, B:329:0x0625, B:331:0x0643, B:332:0x0645, B:338:0x064f, B:339:0x0650, B:340:0x0659, B:341:0x065b, B:354:0x067d, B:355:0x067e, B:357:0x068b, B:364:0x069c, B:366:0x06a4), top: B:381:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00d7 A[Catch: ode -> 0x025f, oah -> 0x026a, ocp -> 0x0698, RuntimeException -> 0x06b3, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x06b3, blocks: (B:8:0x0012, B:15:0x001f, B:18:0x002a, B:20:0x0032, B:22:0x003c, B:316:0x05f2, B:318:0x05f8, B:322:0x060a, B:25:0x0046, B:27:0x004a, B:28:0x0056, B:30:0x0060, B:32:0x006a, B:33:0x0077, B:39:0x0086, B:41:0x0095, B:43:0x00a9, B:47:0x00b0, B:51:0x00c0, B:53:0x00d7, B:54:0x00db, B:55:0x00e0, B:57:0x00ec, B:58:0x00f3, B:59:0x00f4, B:61:0x0107, B:63:0x011c, B:65:0x0122, B:67:0x012d, B:113:0x01ca, B:68:0x013e, B:72:0x014b, B:120:0x0203, B:122:0x0210, B:125:0x021d, B:127:0x0223, B:129:0x0231, B:130:0x023e, B:131:0x0241, B:133:0x0247, B:135:0x024b, B:138:0x024f, B:139:0x025e, B:117:0x01db, B:118:0x01f3, B:119:0x01f4, B:141:0x0260, B:142:0x0269, B:144:0x026b, B:145:0x0274, B:146:0x0275, B:148:0x027d, B:150:0x0285, B:152:0x028d, B:154:0x02ba, B:156:0x02c2, B:159:0x02c9, B:162:0x02db, B:164:0x02e0, B:171:0x02fc, B:178:0x030f, B:179:0x0314, B:187:0x0327, B:218:0x0382, B:220:0x038f, B:221:0x0392, B:223:0x039f, B:233:0x03bf, B:237:0x03d0, B:190:0x0330, B:197:0x0347, B:201:0x0355, B:208:0x0369, B:209:0x036e, B:216:0x037c, B:238:0x03f2, B:240:0x0400, B:257:0x0467, B:259:0x046c, B:261:0x0472, B:267:0x047c, B:271:0x0483, B:273:0x0489, B:277:0x0492, B:279:0x049f, B:280:0x04a1, B:282:0x04c6, B:284:0x04d2, B:286:0x04f1, B:290:0x04fb, B:291:0x0508, B:292:0x050e, B:294:0x052d, B:296:0x0540, B:303:0x0579, B:307:0x05bf, B:308:0x05c1, B:311:0x05c6, B:312:0x05e6, B:283:0x04cd, B:243:0x0424, B:246:0x042d, B:248:0x043d, B:251:0x044f, B:253:0x0453, B:254:0x045e, B:314:0x05e8, B:315:0x05f1, B:323:0x0615, B:345:0x0663, B:347:0x0669, B:327:0x061d, B:329:0x0625, B:331:0x0643, B:332:0x0645, B:338:0x064f, B:339:0x0650, B:340:0x0659, B:341:0x065b, B:354:0x067d, B:355:0x067e, B:357:0x068b, B:364:0x069c, B:366:0x06a4), top: B:381:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0107 A[Catch: ode -> 0x025f, oah -> 0x026a, ocp -> 0x0698, RuntimeException -> 0x06b3, TryCatch #4 {RuntimeException -> 0x06b3, blocks: (B:8:0x0012, B:15:0x001f, B:18:0x002a, B:20:0x0032, B:22:0x003c, B:316:0x05f2, B:318:0x05f8, B:322:0x060a, B:25:0x0046, B:27:0x004a, B:28:0x0056, B:30:0x0060, B:32:0x006a, B:33:0x0077, B:39:0x0086, B:41:0x0095, B:43:0x00a9, B:47:0x00b0, B:51:0x00c0, B:53:0x00d7, B:54:0x00db, B:55:0x00e0, B:57:0x00ec, B:58:0x00f3, B:59:0x00f4, B:61:0x0107, B:63:0x011c, B:65:0x0122, B:67:0x012d, B:113:0x01ca, B:68:0x013e, B:72:0x014b, B:120:0x0203, B:122:0x0210, B:125:0x021d, B:127:0x0223, B:129:0x0231, B:130:0x023e, B:131:0x0241, B:133:0x0247, B:135:0x024b, B:138:0x024f, B:139:0x025e, B:117:0x01db, B:118:0x01f3, B:119:0x01f4, B:141:0x0260, B:142:0x0269, B:144:0x026b, B:145:0x0274, B:146:0x0275, B:148:0x027d, B:150:0x0285, B:152:0x028d, B:154:0x02ba, B:156:0x02c2, B:159:0x02c9, B:162:0x02db, B:164:0x02e0, B:171:0x02fc, B:178:0x030f, B:179:0x0314, B:187:0x0327, B:218:0x0382, B:220:0x038f, B:221:0x0392, B:223:0x039f, B:233:0x03bf, B:237:0x03d0, B:190:0x0330, B:197:0x0347, B:201:0x0355, B:208:0x0369, B:209:0x036e, B:216:0x037c, B:238:0x03f2, B:240:0x0400, B:257:0x0467, B:259:0x046c, B:261:0x0472, B:267:0x047c, B:271:0x0483, B:273:0x0489, B:277:0x0492, B:279:0x049f, B:280:0x04a1, B:282:0x04c6, B:284:0x04d2, B:286:0x04f1, B:290:0x04fb, B:291:0x0508, B:292:0x050e, B:294:0x052d, B:296:0x0540, B:303:0x0579, B:307:0x05bf, B:308:0x05c1, B:311:0x05c6, B:312:0x05e6, B:283:0x04cd, B:243:0x0424, B:246:0x042d, B:248:0x043d, B:251:0x044f, B:253:0x0453, B:254:0x045e, B:314:0x05e8, B:315:0x05f1, B:323:0x0615, B:345:0x0663, B:347:0x0669, B:327:0x061d, B:329:0x0625, B:331:0x0643, B:332:0x0645, B:338:0x064f, B:339:0x0650, B:340:0x0659, B:341:0x065b, B:354:0x067d, B:355:0x067e, B:357:0x068b, B:364:0x069c, B:366:0x06a4), top: B:381:0x0012 }] */
            @Override // android.os.Handler.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean handleMessage(android.os.Message r30) throws defpackage.oah, defpackage.ocp {
                /*
                    Method dump skipped, instructions count: 1738
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.oeh.handleMessage(android.os.Message):boolean");
            }
        });
    }

    public final void a(int i, final ocp ocpVar) throws oah {
        char c;
        final ekfw ekfwVar = new ekfw();
        int i2 = 0;
        while (true) {
            List list = this.g;
            if (i2 >= list.size()) {
                break;
            }
            odu oduVar = (odu) list.get(i2);
            oduVar.k();
            ekfwVar.j(oduVar.g.g());
            i2++;
        }
        boolean z = this.x;
        ocp ocpVar2 = null;
        if (!z) {
            synchronized (this.p) {
                this.x = true;
            }
            Log.i("TransformerInternal", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.1] [" + mgb.a + "] [" + mbp.a() + "]");
            int i3 = 0;
            while (true) {
                List list2 = this.j;
                if (i3 >= list2.size()) {
                    break;
                }
                try {
                    ((odm) list2.get(i3)).d();
                } catch (RuntimeException e) {
                    if (ocpVar2 == null) {
                        ocpVar2 = new ocp("Unexpected runtime error", e, 1001);
                        this.u = e;
                    }
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                List list3 = this.g;
                if (i4 < list3.size()) {
                    try {
                        ((odu) list3.get(i4)).g();
                    } catch (RuntimeException e2) {
                        if (ocpVar2 == null) {
                            ocpVar2 = new ocp("Unexpected runtime error", e2, 1001);
                            this.u = e2;
                        }
                    }
                    i4++;
                } else {
                    try {
                        try {
                            break;
                        } catch (RuntimeException e3) {
                            if (ocpVar2 == null) {
                                ocpVar2 = new ocp("Unexpected runtime error", e3, 1001);
                                this.u = e3;
                            }
                        }
                    } catch (oah e4) {
                        if (ocpVar2 == null) {
                            ocpVar2 = new ocp("Muxer error", e4, 7001);
                        }
                    }
                }
            }
            odh odhVar = this.k;
            if (i == 0) {
                c = 0;
            } else if (i == 1) {
                c = 1;
            } else {
                c = 2;
                if (i != 2) {
                    throw new IllegalStateException(a.g(i, "Unexpected end reason "));
                }
            }
            odhVar.f = false;
            oag oagVar = odhVar.l;
            if (oagVar != null) {
                try {
                    oagVar.close();
                } catch (oah e5) {
                    if (c == 1) {
                        String message = e5.getMessage();
                        mee.f(message);
                        if (message.equals("Failed to stop the MediaMuxer")) {
                        }
                    }
                    throw e5;
                }
            }
            mew mewVar = this.f;
            final HandlerThread handlerThread = this.z;
            handlerThread.getClass();
            mewVar.b(new Runnable() { // from class: oei
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quitSafely();
                }
            });
        }
        if (i == 1) {
            this.l.e();
            return;
        }
        if (ocpVar == null) {
            ocpVar = ocpVar2;
        }
        if (ocpVar == null) {
            if (z) {
                return;
            }
            mee.c(this.y.b(new Runnable() { // from class: oek
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    boolean z2;
                    oer oerVar = this.a;
                    oat oatVar = oerVar.d;
                    ekgb ekgbVarG = ekfwVar.g();
                    String str = oatVar.b;
                    String str2 = oatVar.c;
                    oeg oegVar = ((oee) oerVar.e).a;
                    ocq ocqVar = oegVar.f;
                    ocqVar.c(ekgbVarG);
                    if (str != null) {
                        ocqVar.f = str;
                    }
                    if (str2 != null) {
                        ocqVar.m = str2;
                    }
                    oegVar.g = null;
                    int i5 = oegVar.j;
                    boolean z3 = true;
                    if (i5 != 1) {
                        if (i5 == 2) {
                            oegVar.j = 3;
                            long j = odh.a;
                            throw null;
                        }
                        if (i5 == 3) {
                            oegVar.j = 4;
                            throw null;
                        }
                        if (i5 == 5) {
                            oegVar.j = 6;
                            oay oayVar = oegVar.h;
                            mee.f(oayVar);
                            throw null;
                        }
                        if (i5 != 6) {
                            oegVar.c();
                            return;
                        } else {
                            ocqVar.o = 1;
                            oegVar.c();
                            return;
                        }
                    }
                    oegVar.j = 2;
                    oay oayVar2 = oegVar.h;
                    mee.f(oayVar2);
                    oax oaxVar = new oax(oayVar2);
                    ArrayList arrayList = new ArrayList();
                    int i6 = 0;
                    while (true) {
                        ekgb ekgbVar = oayVar2.a;
                        if (i6 >= ekgbVar.size()) {
                            mee.b(!arrayList.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
                            oaxVar.a = ekgb.n(arrayList);
                            oaxVar.a();
                            throw null;
                        }
                        obv obvVar = (obv) ekgbVar.get(i6);
                        ekgb ekgbVar2 = obvVar.a;
                        ArrayList arrayList2 = new ArrayList();
                        int i7 = 0;
                        while (i7 < ((ekoe) ekgbVar2).c) {
                            obt obtVar = (obt) ekgbVar2.get(i7);
                            mbo mboVarA = obtVar.a;
                            long j2 = obtVar.e;
                            oca ocaVar = obtVar.g;
                            if (i7 == 0) {
                                mbf mbfVar = mboVarA.e;
                                mbe mbeVar = new mbe(mbfVar);
                                z2 = z3;
                                long jW = mgb.w(mbfVar.b + mgb.B(0L));
                                mee.a(jW >= 0 ? z2 : false);
                                mbeVar.a = jW;
                                mbf mbfVar2 = new mbf(mbeVar);
                                mbd mbdVar = new mbd(mboVarA);
                                mbdVar.b = new mbe(mbfVar2);
                                mboVarA = mbdVar.a();
                                i7 = 0;
                            } else {
                                z2 = z3;
                            }
                            arrayList2.add(new obt(mboVarA, true, j2, ocaVar));
                            i7++;
                            z3 = z2;
                        }
                        obu obuVar = new obu(arrayList2);
                        boolean z4 = obvVar.b;
                        arrayList.add(new obv(obuVar));
                        i6++;
                    }
                }
            }));
        } else if (z) {
            Log.w("TransformerInternal", "Export error after export ended", ocpVar);
        } else {
            mee.c(this.y.b(new Runnable() { // from class: oej
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    final ocp ocpVar3 = ocpVar;
                    int i5 = ocpVar3.b;
                    oer oerVar = this.a;
                    oen oenVar = oerVar.e;
                    ekgb ekgbVarG = ekfwVar.g();
                    oat oatVar = oerVar.d;
                    String str = oatVar.b;
                    String str2 = oatVar.c;
                    if (i5 == 7003) {
                        oeg oegVar = ((oee) oenVar).a;
                        if (oegVar.g() || oegVar.f()) {
                            oegVar.g = null;
                            ocq ocqVar = oegVar.f;
                            ocqVar.b();
                            ocqVar.o = 6;
                            oegVar.j = 0;
                            oay oayVar = oegVar.h;
                            mee.f(oayVar);
                            String str3 = oegVar.i;
                            mee.f(str3);
                            oaf oafVar = oegVar.d;
                            oee oeeVar = oegVar.e;
                            oegVar.i(oayVar, new odh(str3, oafVar, oeeVar), oeeVar);
                            return;
                        }
                        i5 = 7003;
                    }
                    final oeg oegVar2 = ((oee) oenVar).a;
                    ocq ocqVar2 = oegVar2.f;
                    ocqVar2.c(ekgbVarG);
                    if (str != null) {
                        ocqVar2.f = str;
                    }
                    if (str2 != null) {
                        ocqVar2.m = str2;
                    }
                    ocqVar2.p = ocpVar3;
                    oegVar2.b();
                    ocs ocsVarA = ocqVar2.a();
                    mez mezVar = new mez() { // from class: ody
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                            oay oayVar2 = oegVar2.h;
                            mee.f(oayVar2);
                            ((oef) obj).b(oayVar2, ocpVar3);
                        }
                    };
                    mfc mfcVar = oegVar2.c;
                    mfcVar.d(-1, mezVar);
                    mfcVar.c();
                    if (oegVar2.e()) {
                        odj odjVar = new odj();
                        int i6 = oegVar2.a(odjVar) == 2 ? odjVar.a : -1;
                        obz obzVar = oegVar2.k;
                        mee.f(obzVar);
                        EditingEndedEvent.Builder errorCode = obzVar.a(3).setErrorCode(obz.a.get(i5, 1));
                        if (i6 != -1) {
                            errorCode.setFinalProgressPercent(i6);
                        }
                        List listC = obz.c(ocsVarA.q);
                        for (int i7 = 0; i7 < listC.size(); i7++) {
                            errorCode.addInputMediaItemInfo(ait$$ExternalSyntheticApiModelOutline0.m129m(listC.get(i7)));
                        }
                        errorCode.setOutputMediaItemInfo(obz.b(ocsVarA));
                        oby obyVar = obzVar.b;
                        obyVar.a(errorCode.build());
                        try {
                            obyVar.close();
                        } catch (Exception e6) {
                            mff.d("EditingMetricsCollector", "error while closing the metrics reporter", e6);
                        }
                    }
                    oegVar2.j = 0;
                    oegVar2.g = null;
                }
            }));
        }
    }

    public final void b(ocp ocpVar) {
        synchronized (this.p) {
            if (this.x) {
                Log.w("TransformerInternal", "Export error after export ended", ocpVar);
            } else {
                c();
                this.f.g(4, 2, ocpVar).b();
            }
        }
    }

    public final void c() {
        mee.d(this.z.isAlive(), "Internal thread is dead.");
    }
}
