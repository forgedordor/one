package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gc {
    public final ea a;
    private final er c;
    private final ge d;
    private boolean e = false;
    public int b = -1;

    public gc(er erVar, ge geVar, ea eaVar) {
        this.c = erVar;
        this.d = geVar;
        this.a = eaVar;
    }

    final Bundle a() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ea eaVar = this.a;
        if (eaVar.g == -1 && (bundle = eaVar.h) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new ga(eaVar));
        if (eaVar.g >= 0) {
            Bundle bundle3 = new Bundle();
            eaVar.k(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.c.j(eaVar, bundle3);
            Bundle bundle4 = new Bundle();
            eaVar.ad.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleC = eaVar.D.c();
            if (!bundleC.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleC);
            }
            if (eaVar.Q != null) {
                g();
            }
            SparseArray<? extends Parcelable> sparseArray = eaVar.i;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = eaVar.j;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = eaVar.m;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    final void b() {
        View view;
        View view2;
        ea eaVar = this.a;
        ea eaVarI = fr.i(eaVar.P);
        ea eaVar2 = eaVar.E;
        if (eaVarI != null && !eaVarI.equals(eaVar2)) {
            int i = eaVar.G;
            int i2 = lsb.a;
            eaVar.getClass();
            lsn lsnVar = new lsn(eaVar, eaVarI, i);
            lsb.d(lsnVar);
            lsa lsaVarB = lsb.b(eaVar);
            if (lsaVarB.b.contains(lrz.e) && lsb.e(lsaVarB, eaVar.getClass(), lsnVar.getClass())) {
                lsb.c(lsaVarB, lsnVar);
            }
        }
        ge geVar = this.d;
        ViewGroup viewGroup = eaVar.P;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = geVar.a;
            int iIndexOf = arrayList.indexOf(eaVar);
            int i3 = iIndexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        ea eaVar3 = (ea) arrayList.get(iIndexOf);
                        if (eaVar3.P == viewGroup && (view = eaVar3.Q) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    ea eaVar4 = (ea) arrayList.get(i3);
                    if (eaVar4.P == viewGroup && (view2 = eaVar4.Q) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        eaVar.P.addView(eaVar.Q, iIndexOfChild);
    }

    final void c() throws Resources.NotFoundException {
        String resourceName;
        ea eaVar = this.a;
        if (eaVar.v) {
            return;
        }
        if (fr.ad(3)) {
            Objects.toString(eaVar);
            Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(eaVar)));
        }
        Bundle bundle = eaVar.h;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterL = eaVar.L(bundle2);
        ViewGroup viewGroup2 = eaVar.P;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = eaVar.G;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(a.h(eaVar, "Cannot create fragment ", " for a container view with no id"));
                }
                viewGroup = (ViewGroup) eaVar.B.p.a(i);
                if (viewGroup == null) {
                    if (!eaVar.y && !eaVar.x) {
                        try {
                            resourceName = eaVar.B().getResourceName(eaVar.G);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        StringBuilder sb = new StringBuilder("No view found for id 0x");
                        ea eaVar2 = this.a;
                        sb.append(Integer.toHexString(eaVar2.G));
                        sb.append(" (");
                        sb.append(resourceName);
                        sb.append(") for fragment ");
                        sb.append(eaVar2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    ea eaVar3 = this.a;
                    int i2 = lsb.a;
                    eaVar3.getClass();
                    lsm lsmVar = new lsm(eaVar3, viewGroup);
                    lsb.d(lsmVar);
                    lsa lsaVarB = lsb.b(eaVar3);
                    if (lsaVarB.b.contains(lrz.i) && lsb.e(lsaVarB, eaVar3.getClass(), lsmVar.getClass())) {
                        lsb.c(lsaVarB, lsmVar);
                    }
                }
            }
        }
        ea eaVar4 = this.a;
        eaVar4.P = viewGroup;
        eaVar4.o(layoutInflaterL, viewGroup, bundle2);
        if (eaVar4.Q != null) {
            if (fr.ad(3)) {
                Objects.toString(eaVar4);
                Log.d("FragmentManager", "moveto VIEW_CREATED: ".concat(String.valueOf(eaVar4)));
            }
            eaVar4.Q.setSaveFromParentEnabled(false);
            eaVar4.Q.setTag(R.id.fragment_container_view_tag, eaVar4);
            if (viewGroup != null) {
                b();
            }
            if (eaVar4.I) {
                eaVar4.Q.setVisibility(8);
            }
            if (eaVar4.Q.isAttachedToWindow()) {
                View view = eaVar4.Q;
                int[] iArr = ley.a;
                lel.c(view);
            } else {
                View view2 = eaVar4.Q;
                view2.addOnAttachStateChangeListener(new gb(view2));
            }
            eaVar4.aq();
            this.c.m(eaVar4, eaVar4.Q, bundle2);
            int visibility = eaVar4.Q.getVisibility();
            eaVar4.D().n = eaVar4.Q.getAlpha();
            if (eaVar4.P != null && visibility == 0) {
                View viewFindFocus = eaVar4.Q.findFocus();
                if (viewFindFocus != null) {
                    eaVar4.au(viewFindFocus);
                    if (fr.ad(2)) {
                        Log.v("FragmentManager", a.i(eaVar4, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
                    }
                }
                eaVar4.Q.setAlpha(0.0f);
            }
        }
        eaVar4.g = 2;
    }

    final void d() {
        ea eaVar = this.a;
        if (eaVar.v && eaVar.w && !eaVar.z) {
            if (fr.ad(3)) {
                Objects.toString(eaVar);
                Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(eaVar)));
            }
            Bundle bundle = eaVar.h;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            eaVar.o(eaVar.L(bundle2), null, bundle2);
            View view = eaVar.Q;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                eaVar.Q.setTag(R.id.fragment_container_view_tag, eaVar);
                if (eaVar.I) {
                    eaVar.Q.setVisibility(8);
                }
                eaVar.aq();
                this.c.m(eaVar, eaVar.Q, bundle2);
                eaVar.g = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:430:0x0489, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0489, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:317:0x068d A[Catch: all -> 0x0842, TryCatch #0 {all -> 0x0842, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x011b, B:88:0x012f, B:90:0x0135, B:91:0x0145, B:96:0x014f, B:104:0x0163, B:106:0x016d, B:109:0x0186, B:99:0x0154, B:101:0x015a, B:103:0x015e, B:110:0x01a6, B:112:0x01bf, B:114:0x01ca, B:115:0x01d1, B:116:0x01ea, B:117:0x01f5, B:94:0x014b, B:118:0x01f6, B:119:0x01fa, B:121:0x0200, B:122:0x0210, B:124:0x0225, B:126:0x0230, B:127:0x0237, B:128:0x0243, B:129:0x024e, B:130:0x024f, B:132:0x0253, B:134:0x0257, B:136:0x026f, B:137:0x027f, B:138:0x0282, B:139:0x0286, B:141:0x028c, B:142:0x029c, B:144:0x02a0, B:146:0x02a6, B:148:0x02b6, B:150:0x02bc, B:151:0x02cc, B:153:0x02d0, B:155:0x02d4, B:157:0x02da, B:159:0x02de, B:160:0x02e5, B:162:0x02ee, B:164:0x02f2, B:165:0x02fa, B:166:0x0305, B:167:0x0306, B:168:0x0314, B:169:0x031f, B:170:0x0320, B:171:0x0328, B:173:0x032e, B:174:0x033e, B:176:0x0342, B:177:0x0346, B:179:0x034a, B:181:0x036b, B:182:0x0377, B:183:0x0382, B:184:0x0383, B:185:0x038a, B:187:0x0390, B:188:0x03a0, B:191:0x03a8, B:193:0x03b2, B:204:0x040b, B:205:0x040e, B:207:0x0426, B:208:0x0432, B:210:0x044f, B:211:0x0457, B:213:0x045d, B:214:0x0467, B:215:0x0478, B:216:0x0483, B:194:0x03bc, B:195:0x03db, B:196:0x03dc, B:198:0x03e0, B:201:0x03e9, B:202:0x0408, B:217:0x0484, B:218:0x0486, B:220:0x048c, B:222:0x0492, B:223:0x04a2, B:225:0x04ab, B:226:0x04b2, B:228:0x04c4, B:229:0x04ca, B:230:0x04d5, B:231:0x04d6, B:232:0x04d9, B:234:0x04df, B:235:0x04ef, B:237:0x04f8, B:238:0x04ff, B:240:0x0511, B:241:0x0518, B:242:0x0523, B:243:0x0524, B:245:0x052a, B:246:0x053e, B:248:0x0542, B:254:0x0559, B:256:0x055d, B:258:0x0561, B:260:0x056f, B:261:0x057f, B:262:0x0582, B:249:0x054e, B:251:0x0552, B:253:0x0556, B:263:0x0586, B:264:0x058c, B:266:0x0592, B:267:0x05a2, B:269:0x05a6, B:271:0x05aa, B:272:0x05ad, B:274:0x05b6, B:276:0x05c8, B:277:0x05cf, B:279:0x05da, B:281:0x05eb, B:282:0x05f7, B:283:0x060f, B:284:0x061a, B:285:0x061b, B:287:0x061f, B:289:0x062d, B:290:0x0636, B:292:0x063c, B:293:0x064c, B:295:0x0650, B:300:0x065b, B:302:0x065f, B:304:0x0668, B:307:0x0673, B:309:0x0677, B:311:0x067d, B:313:0x0681, B:314:0x0683, B:315:0x0687, B:317:0x068d, B:320:0x069f, B:323:0x06a5, B:324:0x06ac, B:326:0x06c5, B:327:0x06d4, B:329:0x06da, B:331:0x06e2, B:333:0x06ee, B:334:0x06f3, B:336:0x06f7, B:337:0x06fd, B:338:0x0702, B:339:0x070d, B:318:0x0694, B:340:0x070e, B:342:0x0714, B:343:0x0724, B:345:0x0731, B:347:0x0737, B:348:0x0741, B:350:0x0752, B:356:0x0765, B:358:0x076b, B:359:0x0779, B:353:0x0759, B:360:0x077e, B:361:0x0789, B:364:0x078e, B:366:0x0792, B:368:0x0798, B:370:0x079c, B:372:0x07a2, B:373:0x07b6, B:375:0x07c6, B:376:0x07d8, B:377:0x07db, B:379:0x07df, B:381:0x07e3, B:383:0x07e7, B:385:0x07f3, B:387:0x07f9, B:388:0x0809, B:389:0x080d, B:391:0x0813, B:392:0x0823, B:393:0x0826, B:395:0x082a, B:397:0x082e, B:399:0x0834, B:400:0x0836, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:26:0x005f, B:28:0x0069, B:30:0x006f, B:31:0x0074, B:33:0x0078, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:42:0x0093, B:43:0x0097, B:45:0x009b, B:47:0x00ac, B:49:0x00b0, B:51:0x00b6, B:54:0x00bc, B:60:0x00c6, B:69:0x00e5, B:71:0x00e9, B:73:0x00ed, B:74:0x00f1, B:76:0x00f5, B:77:0x00f9, B:79:0x00ff, B:62:0x00cd, B:63:0x00d2, B:65:0x00d6, B:67:0x00dc, B:68:0x00e1, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:406:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0694 A[Catch: all -> 0x0842, TryCatch #0 {all -> 0x0842, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x011b, B:88:0x012f, B:90:0x0135, B:91:0x0145, B:96:0x014f, B:104:0x0163, B:106:0x016d, B:109:0x0186, B:99:0x0154, B:101:0x015a, B:103:0x015e, B:110:0x01a6, B:112:0x01bf, B:114:0x01ca, B:115:0x01d1, B:116:0x01ea, B:117:0x01f5, B:94:0x014b, B:118:0x01f6, B:119:0x01fa, B:121:0x0200, B:122:0x0210, B:124:0x0225, B:126:0x0230, B:127:0x0237, B:128:0x0243, B:129:0x024e, B:130:0x024f, B:132:0x0253, B:134:0x0257, B:136:0x026f, B:137:0x027f, B:138:0x0282, B:139:0x0286, B:141:0x028c, B:142:0x029c, B:144:0x02a0, B:146:0x02a6, B:148:0x02b6, B:150:0x02bc, B:151:0x02cc, B:153:0x02d0, B:155:0x02d4, B:157:0x02da, B:159:0x02de, B:160:0x02e5, B:162:0x02ee, B:164:0x02f2, B:165:0x02fa, B:166:0x0305, B:167:0x0306, B:168:0x0314, B:169:0x031f, B:170:0x0320, B:171:0x0328, B:173:0x032e, B:174:0x033e, B:176:0x0342, B:177:0x0346, B:179:0x034a, B:181:0x036b, B:182:0x0377, B:183:0x0382, B:184:0x0383, B:185:0x038a, B:187:0x0390, B:188:0x03a0, B:191:0x03a8, B:193:0x03b2, B:204:0x040b, B:205:0x040e, B:207:0x0426, B:208:0x0432, B:210:0x044f, B:211:0x0457, B:213:0x045d, B:214:0x0467, B:215:0x0478, B:216:0x0483, B:194:0x03bc, B:195:0x03db, B:196:0x03dc, B:198:0x03e0, B:201:0x03e9, B:202:0x0408, B:217:0x0484, B:218:0x0486, B:220:0x048c, B:222:0x0492, B:223:0x04a2, B:225:0x04ab, B:226:0x04b2, B:228:0x04c4, B:229:0x04ca, B:230:0x04d5, B:231:0x04d6, B:232:0x04d9, B:234:0x04df, B:235:0x04ef, B:237:0x04f8, B:238:0x04ff, B:240:0x0511, B:241:0x0518, B:242:0x0523, B:243:0x0524, B:245:0x052a, B:246:0x053e, B:248:0x0542, B:254:0x0559, B:256:0x055d, B:258:0x0561, B:260:0x056f, B:261:0x057f, B:262:0x0582, B:249:0x054e, B:251:0x0552, B:253:0x0556, B:263:0x0586, B:264:0x058c, B:266:0x0592, B:267:0x05a2, B:269:0x05a6, B:271:0x05aa, B:272:0x05ad, B:274:0x05b6, B:276:0x05c8, B:277:0x05cf, B:279:0x05da, B:281:0x05eb, B:282:0x05f7, B:283:0x060f, B:284:0x061a, B:285:0x061b, B:287:0x061f, B:289:0x062d, B:290:0x0636, B:292:0x063c, B:293:0x064c, B:295:0x0650, B:300:0x065b, B:302:0x065f, B:304:0x0668, B:307:0x0673, B:309:0x0677, B:311:0x067d, B:313:0x0681, B:314:0x0683, B:315:0x0687, B:317:0x068d, B:320:0x069f, B:323:0x06a5, B:324:0x06ac, B:326:0x06c5, B:327:0x06d4, B:329:0x06da, B:331:0x06e2, B:333:0x06ee, B:334:0x06f3, B:336:0x06f7, B:337:0x06fd, B:338:0x0702, B:339:0x070d, B:318:0x0694, B:340:0x070e, B:342:0x0714, B:343:0x0724, B:345:0x0731, B:347:0x0737, B:348:0x0741, B:350:0x0752, B:356:0x0765, B:358:0x076b, B:359:0x0779, B:353:0x0759, B:360:0x077e, B:361:0x0789, B:364:0x078e, B:366:0x0792, B:368:0x0798, B:370:0x079c, B:372:0x07a2, B:373:0x07b6, B:375:0x07c6, B:376:0x07d8, B:377:0x07db, B:379:0x07df, B:381:0x07e3, B:383:0x07e7, B:385:0x07f3, B:387:0x07f9, B:388:0x0809, B:389:0x080d, B:391:0x0813, B:392:0x0823, B:393:0x0826, B:395:0x082a, B:397:0x082e, B:399:0x0834, B:400:0x0836, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:26:0x005f, B:28:0x0069, B:30:0x006f, B:31:0x0074, B:33:0x0078, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:42:0x0093, B:43:0x0097, B:45:0x009b, B:47:0x00ac, B:49:0x00b0, B:51:0x00b6, B:54:0x00bc, B:60:0x00c6, B:69:0x00e5, B:71:0x00e9, B:73:0x00ed, B:74:0x00f1, B:76:0x00f5, B:77:0x00f9, B:79:0x00ff, B:62:0x00cd, B:63:0x00d2, B:65:0x00d6, B:67:0x00dc, B:68:0x00e1, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:406:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06c5 A[Catch: all -> 0x0842, TryCatch #0 {all -> 0x0842, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x011b, B:88:0x012f, B:90:0x0135, B:91:0x0145, B:96:0x014f, B:104:0x0163, B:106:0x016d, B:109:0x0186, B:99:0x0154, B:101:0x015a, B:103:0x015e, B:110:0x01a6, B:112:0x01bf, B:114:0x01ca, B:115:0x01d1, B:116:0x01ea, B:117:0x01f5, B:94:0x014b, B:118:0x01f6, B:119:0x01fa, B:121:0x0200, B:122:0x0210, B:124:0x0225, B:126:0x0230, B:127:0x0237, B:128:0x0243, B:129:0x024e, B:130:0x024f, B:132:0x0253, B:134:0x0257, B:136:0x026f, B:137:0x027f, B:138:0x0282, B:139:0x0286, B:141:0x028c, B:142:0x029c, B:144:0x02a0, B:146:0x02a6, B:148:0x02b6, B:150:0x02bc, B:151:0x02cc, B:153:0x02d0, B:155:0x02d4, B:157:0x02da, B:159:0x02de, B:160:0x02e5, B:162:0x02ee, B:164:0x02f2, B:165:0x02fa, B:166:0x0305, B:167:0x0306, B:168:0x0314, B:169:0x031f, B:170:0x0320, B:171:0x0328, B:173:0x032e, B:174:0x033e, B:176:0x0342, B:177:0x0346, B:179:0x034a, B:181:0x036b, B:182:0x0377, B:183:0x0382, B:184:0x0383, B:185:0x038a, B:187:0x0390, B:188:0x03a0, B:191:0x03a8, B:193:0x03b2, B:204:0x040b, B:205:0x040e, B:207:0x0426, B:208:0x0432, B:210:0x044f, B:211:0x0457, B:213:0x045d, B:214:0x0467, B:215:0x0478, B:216:0x0483, B:194:0x03bc, B:195:0x03db, B:196:0x03dc, B:198:0x03e0, B:201:0x03e9, B:202:0x0408, B:217:0x0484, B:218:0x0486, B:220:0x048c, B:222:0x0492, B:223:0x04a2, B:225:0x04ab, B:226:0x04b2, B:228:0x04c4, B:229:0x04ca, B:230:0x04d5, B:231:0x04d6, B:232:0x04d9, B:234:0x04df, B:235:0x04ef, B:237:0x04f8, B:238:0x04ff, B:240:0x0511, B:241:0x0518, B:242:0x0523, B:243:0x0524, B:245:0x052a, B:246:0x053e, B:248:0x0542, B:254:0x0559, B:256:0x055d, B:258:0x0561, B:260:0x056f, B:261:0x057f, B:262:0x0582, B:249:0x054e, B:251:0x0552, B:253:0x0556, B:263:0x0586, B:264:0x058c, B:266:0x0592, B:267:0x05a2, B:269:0x05a6, B:271:0x05aa, B:272:0x05ad, B:274:0x05b6, B:276:0x05c8, B:277:0x05cf, B:279:0x05da, B:281:0x05eb, B:282:0x05f7, B:283:0x060f, B:284:0x061a, B:285:0x061b, B:287:0x061f, B:289:0x062d, B:290:0x0636, B:292:0x063c, B:293:0x064c, B:295:0x0650, B:300:0x065b, B:302:0x065f, B:304:0x0668, B:307:0x0673, B:309:0x0677, B:311:0x067d, B:313:0x0681, B:314:0x0683, B:315:0x0687, B:317:0x068d, B:320:0x069f, B:323:0x06a5, B:324:0x06ac, B:326:0x06c5, B:327:0x06d4, B:329:0x06da, B:331:0x06e2, B:333:0x06ee, B:334:0x06f3, B:336:0x06f7, B:337:0x06fd, B:338:0x0702, B:339:0x070d, B:318:0x0694, B:340:0x070e, B:342:0x0714, B:343:0x0724, B:345:0x0731, B:347:0x0737, B:348:0x0741, B:350:0x0752, B:356:0x0765, B:358:0x076b, B:359:0x0779, B:353:0x0759, B:360:0x077e, B:361:0x0789, B:364:0x078e, B:366:0x0792, B:368:0x0798, B:370:0x079c, B:372:0x07a2, B:373:0x07b6, B:375:0x07c6, B:376:0x07d8, B:377:0x07db, B:379:0x07df, B:381:0x07e3, B:383:0x07e7, B:385:0x07f3, B:387:0x07f9, B:388:0x0809, B:389:0x080d, B:391:0x0813, B:392:0x0823, B:393:0x0826, B:395:0x082a, B:397:0x082e, B:399:0x0834, B:400:0x0836, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:26:0x005f, B:28:0x0069, B:30:0x006f, B:31:0x0074, B:33:0x0078, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:42:0x0093, B:43:0x0097, B:45:0x009b, B:47:0x00ac, B:49:0x00b0, B:51:0x00b6, B:54:0x00bc, B:60:0x00c6, B:69:0x00e5, B:71:0x00e9, B:73:0x00ed, B:74:0x00f1, B:76:0x00f5, B:77:0x00f9, B:79:0x00ff, B:62:0x00cd, B:63:0x00d2, B:65:0x00d6, B:67:0x00dc, B:68:0x00e1, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:406:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0702 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void e() {
        /*
            Method dump skipped, instructions count: 2158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc.e():void");
    }

    final void f(ClassLoader classLoader) {
        ea eaVar = this.a;
        Bundle bundle = eaVar.h;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (eaVar.h.getBundle("savedInstanceState") == null) {
            eaVar.h.putBundle("savedInstanceState", new Bundle());
        }
        try {
            eaVar.i = eaVar.h.getSparseParcelableArray("viewState");
            ea eaVar2 = this.a;
            eaVar2.j = eaVar2.h.getBundle("viewRegistryState");
            ga gaVar = (ga) eaVar2.h.getParcelable("state");
            if (gaVar != null) {
                eaVar2.o = gaVar.m;
                eaVar2.p = gaVar.n;
                Boolean bool = eaVar2.k;
                if (bool != null) {
                    eaVar2.S = bool.booleanValue();
                    eaVar2.k = null;
                } else {
                    eaVar2.S = gaVar.o;
                }
            }
            if (eaVar2.S) {
                return;
            }
            eaVar2.R = true;
        } catch (BadParcelableException e) {
            ea eaVar3 = this.a;
            Objects.toString(eaVar3);
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(eaVar3)), e);
        }
    }

    final void g() {
        ea eaVar = this.a;
        if (eaVar.Q == null) {
            return;
        }
        if (fr.ad(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + eaVar + " with view " + eaVar.Q);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        eaVar.Q.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            eaVar.i = sparseArray;
        }
        Bundle bundle = new Bundle();
        eaVar.aa.b.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        eaVar.j = bundle;
    }

    public gc(er erVar, ge geVar, ea eaVar, Bundle bundle) {
        this.c = erVar;
        this.d = geVar;
        this.a = eaVar;
        eaVar.i = null;
        eaVar.j = null;
        eaVar.A = 0;
        eaVar.w = false;
        eaVar.r = false;
        ea eaVar2 = eaVar.n;
        eaVar.o = eaVar2 != null ? eaVar2.l : null;
        eaVar.n = null;
        eaVar.h = bundle;
        eaVar.m = bundle.getBundle("arguments");
    }

    public gc(er erVar, ge geVar, ClassLoader classLoader, em emVar, Bundle bundle) {
        this.c = erVar;
        this.d = geVar;
        ea eaVarA = ((ga) bundle.getParcelable("state")).a(emVar);
        this.a = eaVarA;
        eaVarA.h = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        eaVarA.at(bundle2);
        if (fr.ad(2)) {
            Objects.toString(eaVarA);
            Log.v("FragmentManager", "Instantiated fragment ".concat(String.valueOf(eaVarA)));
        }
    }
}
