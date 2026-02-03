package org.xbill.DNS2;

import defpackage.fgyu;
import defpackage.fgyz;
import defpackage.fhae;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ResolverConfig {
    static Class a;
    static Class b;
    private static ResolverConfig e;
    public String[] servers = null;
    public fgyu[] c = null;
    public int d = -1;

    static {
        ResolverConfig resolverConfig = new ResolverConfig();
        Class clsA = a;
        if (clsA == null) {
            clsA = a("org.xbill.DNS2.ResolverConfig");
            a = clsA;
        }
        synchronized (clsA) {
            e = resolverConfig;
        }
    }

    public ResolverConfig() throws Throwable {
        List arrayList = new ArrayList(0);
        List arrayList2 = new ArrayList(0);
        String property = System.getProperty("dns.server");
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
            while (stringTokenizer.hasMoreTokens()) {
                h(stringTokenizer.nextToken(), arrayList);
            }
        }
        String property2 = System.getProperty("dns.search");
        if (property2 != null) {
            StringTokenizer stringTokenizer2 = new StringTokenizer(property2, ",");
            while (stringTokenizer2.hasMoreTokens()) {
                g(stringTokenizer2.nextToken(), arrayList2);
            }
        }
        c(arrayList, arrayList2);
        if (this.servers == null || this.c == null) {
            List arrayList3 = new ArrayList(0);
            List arrayList4 = new ArrayList(0);
            try {
                Class<?> cls = Class.forName("sun.net.dns.ResolverConfiguration");
                Object objInvoke = cls.getDeclaredMethod("open", null).invoke(null, null);
                List list = (List) cls.getMethod("nameservers", null).invoke(objInvoke, null);
                List list2 = (List) cls.getMethod("searchlist", null).invoke(objInvoke, null);
                if (list.size() != 0) {
                    if (list.size() > 0) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            h((String) it.next(), arrayList3);
                        }
                    }
                    if (list2.size() > 0) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            g((String) it2.next(), arrayList4);
                        }
                    }
                    c(arrayList3, arrayList4);
                    return;
                }
            } catch (Exception unused) {
            }
            if (this.servers == null || this.c == null) {
                String property3 = System.getProperty("os.name");
                String property4 = System.getProperty("java.vendor");
                if (property3.indexOf("Windows") != -1) {
                    try {
                        if (property3.indexOf("95") == -1 && property3.indexOf("98") == -1 && property3.indexOf("ME") == -1) {
                            Process processExec = Runtime.getRuntime().exec("ipconfig /all");
                            e(processExec.getInputStream());
                            processExec.destroy();
                        } else {
                            Runtime runtime = Runtime.getRuntime();
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("winipcfg /all /batch ");
                            stringBuffer.append("winipcfg.out");
                            runtime.exec(stringBuffer.toString()).waitFor();
                            e(new FileInputStream(new File("winipcfg.out")));
                            new File("winipcfg.out").delete();
                        }
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                if (property3.indexOf("NetWare") != -1) {
                    d("sys:/etc/resolv.cfg");
                    return;
                }
                if (property4.indexOf("Android") == -1) {
                    d("/etc/resolv.conf");
                    return;
                }
                ArrayList arrayList5 = new ArrayList();
                List arrayList6 = new ArrayList();
                try {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    Class<?> clsA = b;
                    if (clsA == null) {
                        clsA = a("java.lang.String");
                        b = clsA;
                    }
                    Method method = cls2.getMethod("get", clsA);
                    String[] strArr = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
                    for (int i = 0; i < 4; i++) {
                        String str = (String) method.invoke(null, strArr[i]);
                        if (str != null && ((str.matches("^\\d+(\\.\\d+){3}$") || str.matches("^[0-9a-f]+(:[0-9a-f]*)+:[0-9a-f]+$")) && !arrayList5.contains(str))) {
                            arrayList5.add(str);
                        }
                    }
                } catch (Exception unused3) {
                }
                c(arrayList5, arrayList6);
            }
        }
    }

    static Class a(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError().initCause(e2);
        }
    }

    public static synchronized ResolverConfig b() {
        return e;
    }

    private final void c(List list, List list2) {
        if (this.servers == null && list.size() > 0) {
            this.servers = (String[]) list.toArray(new String[0]);
        }
        if (this.c != null || list2.size() <= 0) {
            return;
        }
        this.c = (fgyu[]) list2.toArray(new fgyu[0]);
    }

    private final void d(String str) throws IOException, NumberFormatException {
        int i;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            ArrayList arrayList = new ArrayList(0);
            ArrayList arrayList2 = new ArrayList(0);
            int i2 = -1;
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (line.startsWith("nameserver")) {
                        StringTokenizer stringTokenizer = new StringTokenizer(line);
                        stringTokenizer.nextToken();
                        h(stringTokenizer.nextToken(), arrayList);
                    } else if (line.startsWith("domain")) {
                        StringTokenizer stringTokenizer2 = new StringTokenizer(line);
                        stringTokenizer2.nextToken();
                        if (stringTokenizer2.hasMoreTokens() && arrayList2.isEmpty()) {
                            g(stringTokenizer2.nextToken(), arrayList2);
                        }
                    } else if (line.startsWith("search")) {
                        if (!arrayList2.isEmpty()) {
                            arrayList2.clear();
                        }
                        StringTokenizer stringTokenizer3 = new StringTokenizer(line);
                        stringTokenizer3.nextToken();
                        while (stringTokenizer3.hasMoreTokens()) {
                            g(stringTokenizer3.nextToken(), arrayList2);
                        }
                    } else if (line.startsWith("options")) {
                        StringTokenizer stringTokenizer4 = new StringTokenizer(line);
                        stringTokenizer4.nextToken();
                        while (stringTokenizer4.hasMoreTokens()) {
                            String strNextToken = stringTokenizer4.nextToken();
                            if (strNextToken.startsWith("ndots:")) {
                                String strSubstring = strNextToken.substring(6);
                                try {
                                    i = Integer.parseInt(strSubstring);
                                } catch (NumberFormatException unused) {
                                }
                                if (i >= 0) {
                                    if (fgyz.a("verbose")) {
                                        PrintStream printStream = System.out;
                                        StringBuffer stringBuffer = new StringBuffer();
                                        stringBuffer.append("setting ndots ");
                                        stringBuffer.append(strSubstring);
                                        printStream.println(stringBuffer.toString());
                                    }
                                    i2 = i;
                                } else {
                                    i2 = -1;
                                }
                            }
                        }
                    }
                } catch (IOException unused2) {
                }
            }
            bufferedReader.close();
            c(arrayList, arrayList2);
            if (this.d >= 0 || i2 <= 0) {
                return;
            }
            this.d = i2;
        } catch (FileNotFoundException unused3) {
        }
    }

    private final void e(InputStream inputStream) throws Throwable {
        int iIntValue = Integer.getInteger("org.xbill.DNS2.windows.parse.buffer", 8192).intValue();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, iIntValue);
        bufferedInputStream.mark(iIntValue);
        f(bufferedInputStream, null);
        if (this.servers == null) {
            try {
                bufferedInputStream.reset();
                f(bufferedInputStream, new Locale("", ""));
            } catch (IOException unused) {
            }
        }
    }

    private final void f(InputStream inputStream, Locale locale) throws Throwable {
        Class clsA = a;
        if (clsA == null) {
            clsA = a("org.xbill.DNS2.ResolverConfig");
            a = clsA;
        }
        String name = clsA.getPackage().getName();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(name);
        stringBuffer.append(".windows.DNSServer");
        String string = stringBuffer.toString();
        ResourceBundle bundle = locale != null ? ResourceBundle.getBundle(string, locale) : ResourceBundle.getBundle(string);
        String string2 = bundle.getString("host_name");
        String string3 = bundle.getString("primary_dns_suffix");
        String string4 = bundle.getString("dns_suffix");
        String string5 = bundle.getString("dns_servers");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        try {
                            c(arrayList, arrayList2);
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(line);
                    if (!stringTokenizer.hasMoreTokens()) {
                        break;
                    }
                    String strNextToken = stringTokenizer.nextToken();
                    boolean z3 = line.indexOf(":") == -1;
                    z &= z3;
                    z2 &= z3;
                    if (line.indexOf(string2) != -1) {
                        while (stringTokenizer.hasMoreTokens()) {
                            strNextToken = stringTokenizer.nextToken();
                        }
                        try {
                            if (fgyu.e(strNextToken, null).a() != 1) {
                                g(strNextToken, arrayList2);
                            }
                        } catch (fhae unused2) {
                        }
                    } else if (line.indexOf(string3) != -1) {
                        while (stringTokenizer.hasMoreTokens()) {
                            strNextToken = stringTokenizer.nextToken();
                        }
                        if (!strNextToken.equals(":")) {
                            g(strNextToken, arrayList2);
                            z = true;
                        }
                    } else if (z || line.indexOf(string4) != -1) {
                        while (stringTokenizer.hasMoreTokens()) {
                            strNextToken = stringTokenizer.nextToken();
                        }
                        if (!strNextToken.equals(":")) {
                            g(strNextToken, arrayList2);
                            z = true;
                        }
                    } else if (z2 || line.indexOf(string5) != -1) {
                        while (stringTokenizer.hasMoreTokens()) {
                            strNextToken = stringTokenizer.nextToken();
                        }
                        if (!strNextToken.equals(":")) {
                            h(strNextToken, arrayList);
                            z2 = true;
                            z = false;
                        }
                    }
                }
            }
        } catch (IOException unused3) {
        }
    }

    private static final void g(String str, List list) {
        if (fgyz.a("verbose")) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer("adding search ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
        try {
            fgyu fgyuVarE = fgyu.e(str, fgyu.a);
            if (list.contains(fgyuVarE)) {
                return;
            }
            list.add(fgyuVarE);
        } catch (fhae unused) {
        }
    }

    private static final void h(String str, List list) {
        if (list.contains(str)) {
            return;
        }
        if (fgyz.a("verbose")) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer("adding server ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
        list.add(str);
    }
}
