%define        __spec_install_post %{nil}
%define          debug_package %{nil}
%define        __os_install_post %{_dbpath}/brp-compress

Summary: SBT - Scala Simple Build Tool
Name: sbt
Version: 0.13.12
Release: 1
License: GPL+
Group: Development/Tools
SOURCE0 : %{name}-%{version}-TAR-4-RPM.tar.gz
URL: http://toybinprog.company.com/

BuildRoot: %{_tmppath}/%{name}-%{version}-%{release}-root

%description
%{summary}

%prep
%setup -q

%build
# Empty section.

%install
rm -rf %{buildroot}
mkdir -p  %{buildroot}

# in builddir
cp -a * %{buildroot}


%clean
rm -rf %{buildroot}


%files
%defattr(-,root,root,-)
%config(noreplace) %{_sysconfdir}/%{name}/%{name}.conf
%{_bindir}/*

%changelog

EOF
